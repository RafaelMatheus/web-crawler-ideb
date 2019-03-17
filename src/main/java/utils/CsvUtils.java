package utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import common.Config;
import model.InfraEstruturaBasicaModel;

public class CsvUtils {
	public static List<String> getCodFromCsv() {
		List<String> codigos = new ArrayList<String>();
		try {

			CSVReader reader = new CSVReader(new FileReader(Config.pathFile), ';');
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				codigos.add(nextLine[20]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return codigos;

	}

	public static void writeCsv(List<String[]> entries) {

		try {
			CSVWriter writer = new CSVWriter(new FileWriter(Config.pathFileAfter));
			writer.writeAll(entries);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeCsvByInfra(List<InfraEstruturaBasicaModel> infraBasica) {
		List<String[]> entries = new ArrayList<String[]>();
		for (InfraEstruturaBasicaModel infraBasicModel : infraBasica) {
			String[] infra = {infraBasicModel.getAguaConsumidaPorAlunos(),
							  infraBasicModel.getAbastecimentoDeAgua(),
							  infraBasicModel.getAbastecimentoEnergia(),
							  infraBasicModel.getEsgotoSanitario(),
							  infraBasicModel.getBanheiroPredio(),
							  infraBasicModel.getBanheiroFora(),
							  infraBasicModel.getLocalFuncEscola()};
			entries.add(infra);
		}
		
		try {
			CSVWriter writer = new CSVWriter(new FileWriter(Config.pathFileAfter));
			writer.writeAll(entries);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
