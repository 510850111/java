package 单元项目_单词统计;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WordCounter {
	private String name;
	private ArrayList<String> lines;
	private String[][] words;
	private HashMap<String, Integer> map;
	
	public WordCounter(String name){
		this.name = name;
		lines = new ArrayList<>();
		map = new HashMap<>();
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
			while((line = br.readLine()) != null){
				lines.add(line);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void split() {
		words = new String[lines.size()][];
		for(int i = 0; i < lines.size(); i++){
			words[i] = extract(lines.get(i));
		}
	}

	private String[] extract(String line) {
		ArrayList<String> ws = new ArrayList<>();
		Pattern p = Pattern.compile("\\b\\w+\\b");
		Matcher m = p.matcher(line);
		while(m.find()){
			ws.add(m.group());
		}
		String[] a = new String[ws.size()];
		return ws.toArray(a);
	}

	private void count() {
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words[i].length; j++){
				String word = words[i][j].toLowerCase();
				if (map.containsKey(word))
					map.put(word, map.get(word)+1);
				else
					map.put(word, 1);
			}
		}
	}

	private void save() {
		try {
			String[] records = createRecords();
			Writer fw = new FileWriter("result.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(String info : records){
				bw.write(info);
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String[] createRecords() {
		String[] records = new String[map.size()];
		ArrayList<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String w1, String w2) {
				return map.get(w2) - map.get(w1);
			}
		});
		int i = 0;
		for(String w : list){
			records[i++] = String.format("%-20s:%d", 
					w, map.get(w));
		}
		return records;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
