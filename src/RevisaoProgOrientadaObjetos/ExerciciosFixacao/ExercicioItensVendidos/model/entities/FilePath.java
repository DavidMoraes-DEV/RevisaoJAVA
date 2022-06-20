package RevisaoProgOrientadaObjetos.ExerciciosFixacao.ExercicioItensVendidos.model.entities;

import java.io.File;

public class FilePath {

	final String WAY = "C:\\Temp\\";
	private String folder;
	private String file;
	
	public FilePath(String folder) {
		this.folder = folder;
	}

	public FilePath(String folder, String file) {
		
		this.folder = folder;
		this.file = file;
	}
	
	public void createdFolder() throws Exception {
		
		String strFolder = WAY+folder;
		File newFolder = new File(strFolder);
		boolean createdFolder = newFolder.mkdir();
		
		if (!createdFolder) {
			throw new Exception();
		}
	}
	
	public String createdFileCSV() {
		
		String strFile = WAY+folder+"\\"+file+".csv";
		new File(strFile);
		
		return strFile;
	}
	
	public String fullFilePath() {
		return WAY+folder+"\\"+file+".csv";
	}
}
