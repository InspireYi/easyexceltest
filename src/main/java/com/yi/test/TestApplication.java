package com.yi.test;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		List list = new ArrayList<>();

		//报错 excel 放在resources文件里面，调试时改下路径
		File file = new File("G:\\1.xlsx");
		EasyExcel.read(file, UserWorkTypeAndAreaImportBO.class, new SingleRowListener(x -> list.add(x))).sheet(0).doRead();

		//不报错 放在resources文件里面，调试时改下路径
		//File file = new File("G:\\2.xlsx");
		//EasyExcel.read(file, StorageRackExcelBO.class, new SingleRowListener(x -> list.add(x))).sheet(0).doRead();
		System.out.println("已成功读取" + list.size() + "行");
	}

	@Data
	static class SingleRowListener<T> extends AnalysisEventListener<T> {

		private Consumer<T> rowProcessor;

		public SingleRowListener(Consumer<T> rowProcessor) {
			this.rowProcessor = rowProcessor;
		}


		@Override
		public void invoke(T data, AnalysisContext context) {
			rowProcessor.accept(data);
		}

		@Override
		public void doAfterAllAnalysed(AnalysisContext context) {

		}
	}
}
