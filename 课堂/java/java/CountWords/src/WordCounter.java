import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordCounter {
	private String name;
	private ArrayList<String>  lines;
	private String[][] words;
	
	public WordCounter(String name){
		this.name = name;
	}

	public String execute(){
		load();
		split();
		count();
		save();
		return "统计结果见result.txt";
	}
	
	private void load() {
		try {
			Reader fr = new FileReader(name);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine())!= null) {
				lines.add(line);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void split() {
		words = new String[lines.size()][];
		for (int i = 0; i < lines.size(); i++) {
			words[i] = extract(lines.get(i));
		}
	}

	private String[] extract(String line) {
		ArrayList<String> ws = new ArrayList<>();
		Pattern p = Pattern .compile("\\b\\w+\\b");
		Matcher m = p.matcher(line);
		while (m.find()) {
			ws.add(m.group());
		}
		return null;
	}

	private void count() {
		
	}

	private void save() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
