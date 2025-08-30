package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String,String>fruitDictionary;
	
	
	public Dictionary_Chapter21() {
		fruitDictionary = new HashMap<>();
		fruitDictionary.put("apple", "りんご");
		fruitDictionary.put("peach","桃");
		fruitDictionary.put("banana","バナナ");
		fruitDictionary.put("lemon","レモン");
		fruitDictionary.put("pear","梨");
		fruitDictionary.put("kiwi","キウイ");
		fruitDictionary.put("strawberry","イチゴ");
		fruitDictionary.put("grape","ぶどう");
		fruitDictionary.put("muscat","マスカット");
		fruitDictionary.put("cherry","さくらんぼ");
	}
	
	public void serchWords(String[] words) {
		for (String word : words) {
			if(fruitDictionary.containsKey(word)) {
				System.out.println(word + "の意味は" + fruitDictionary.get(word) + "です");
			}else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}