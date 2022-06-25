package RevisaoProgOrientadaObjetos.InterfaceComparable.model.services;

import java.io.File;
import java.io.IOException;

public class ArchiveCsvService implements FolderService, FileService {

	private static final String DEFAULT_PATH = "C:\\Temp\\";
	private String folderName;
	private String fileName;
	
	public ArchiveCsvService() {
	}
	
	public ArchiveCsvService(String folderName) {
		this.folderName = folderName;
	}

	public ArchiveCsvService(String folderName, String fileName) {
		this.folderName = folderName;
		this.fileName = fileName;
	}

	public String getFolderName() {
		return folderName;
	}

	public String getFileName() {
		return fileName;
	}

	public String filePath () {
		return DEFAULT_PATH + folderName + "\\" + fileName + ".csv";
	}

	@Override
	public void newFileCSV() throws IOException {

		File file = new File(filePath());
		boolean createFile = file.createNewFile();
		
		if(!createFile) {
			throw new IOException("Erro, arquivo não foi criado!!!");
		}
	}

	@Override
	public void newFolder() throws IOException {
		
		String fullPath = DEFAULT_PATH + folderName;
		File createFolder = new File(fullPath);
		boolean newFolder = createFolder.mkdir();
		
		if(!newFolder) {
			throw new IOException();
		}
	}
}
