package com.learnjapanese.service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.learnjapanese.entity.Hiragana;

@Service
public class HiraganaServiceImpl implements HiraganaService{
	
	private static final Logger LOG = LoggerFactory.getLogger(HiraganaServiceImpl.class.getName());
	
	static List<Hiragana> hiraganaList = new ArrayList<Hiragana>();
	
	public HiraganaServiceImpl() {
		hiraganaList.add(new Hiragana(1, "あ", "a", "", "/"));
		hiraganaList.add(new Hiragana(2, "い", "i", "", ""));
		hiraganaList.add(new Hiragana(3, "う", "u", "", ""));
		hiraganaList.add(new Hiragana(4, "え", "e", "", ""));
		hiraganaList.add(new Hiragana(5, "お", "o", "", ""));
		hiraganaList.add(new Hiragana(6, "か", "ka", "", ""));
		hiraganaList.add(new Hiragana(7, "き", "ki", "", ""));
		hiraganaList.add(new Hiragana(8, "く", "ku", "", ""));
		hiraganaList.add(new Hiragana(9, "け", "ke", "", ""));
		hiraganaList.add(new Hiragana(10, "こ", "ko", "", ""));
		hiraganaList.add(new Hiragana(11, "さ", "sa", "", ""));
		hiraganaList.add(new Hiragana(12, "し", "shi", "", ""));
		hiraganaList.add(new Hiragana(13, "す", "su", "", ""));
		hiraganaList.add(new Hiragana(14, "せ", "se", "", ""));
		hiraganaList.add(new Hiragana(15, "そ", "so", "", ""));
		hiraganaList.add(new Hiragana(16, "た", "ta", "", ""));
		hiraganaList.add(new Hiragana(17, "ち", "chi", "", ""));
		hiraganaList.add(new Hiragana(18, "つ", "tsu", "", ""));
		hiraganaList.add(new Hiragana(19, "て", "te", "", ""));
		hiraganaList.add(new Hiragana(20, "と", "to", "", ""));
		hiraganaList.add(new Hiragana(21, "な", "na", "", ""));
		hiraganaList.add(new Hiragana(22, "に", "ni", "", ""));
		hiraganaList.add(new Hiragana(23, "ぬ", "nu", "", ""));
		hiraganaList.add(new Hiragana(24, "ね", "ne", "", ""));
		hiraganaList.add(new Hiragana(25, "の", "no", "", ""));
		hiraganaList.add(new Hiragana(26, "は", "ha", "", ""));
		hiraganaList.add(new Hiragana(27, "ひ", "hi", "", ""));
		hiraganaList.add(new Hiragana(28, "ふ", "fu", "", ""));
		hiraganaList.add(new Hiragana(29, "へ", "he", "", ""));
		hiraganaList.add(new Hiragana(30, "ほ", "ho", "", ""));
		hiraganaList.add(new Hiragana(31, "ま", "ma", "", ""));
		hiraganaList.add(new Hiragana(32, "み", "mi", "", ""));
		hiraganaList.add(new Hiragana(33, "む", "mu", "", ""));
		hiraganaList.add(new Hiragana(34, "め", "me", "", ""));
		hiraganaList.add(new Hiragana(35, "も", "mo", "", ""));
		hiraganaList.add(new Hiragana(36, "や", "ya", "", ""));
		hiraganaList.add(new Hiragana(37, "ゆ", "yu", "", ""));
		hiraganaList.add(new Hiragana(38, "よ", "yo", "", ""));
		hiraganaList.add(new Hiragana(39, "ら", "ra", "", ""));
		hiraganaList.add(new Hiragana(40, "り", "ri", "", ""));
		hiraganaList.add(new Hiragana(41, "る", "ru", "", ""));
		hiraganaList.add(new Hiragana(42, "れ", "re", "", ""));
		hiraganaList.add(new Hiragana(43, "ろ", "ro", "", ""));
		hiraganaList.add(new Hiragana(44, "わ", "wa", "", ""));
		hiraganaList.add(new Hiragana(45, "ゐ", "wi", "", ""));
		hiraganaList.add(new Hiragana(46, "ゑ", "we", "", ""));
		hiraganaList.add(new Hiragana(47, "を", "wo", "", ""));
		hiraganaList.add(new Hiragana(48, "ん", "n", "", ""));
		hiraganaList.add(new Hiragana(49, "が", "ga", "", ""));
		hiraganaList.add(new Hiragana(50, "ぎ", "gi", "", ""));
		hiraganaList.add(new Hiragana(51, "ぐ", "gu", "", ""));
		hiraganaList.add(new Hiragana(52, "げ", "ge", "", ""));
		hiraganaList.add(new Hiragana(53, "ご", "go", "", ""));
		hiraganaList.add(new Hiragana(54, "ざ", "za", "", ""));
		hiraganaList.add(new Hiragana(55, "じ", "ji", "", ""));
		hiraganaList.add(new Hiragana(56, "ず", "zu", "", ""));
		hiraganaList.add(new Hiragana(57, "ぜ", "ze", "", ""));
		hiraganaList.add(new Hiragana(58, "ぞ", "zo", "", ""));
		hiraganaList.add(new Hiragana(59, "だ", "da", "", ""));
		hiraganaList.add(new Hiragana(60, "ぢ", "ji", "", ""));
		hiraganaList.add(new Hiragana(61, "づ", "zu", "", ""));
		hiraganaList.add(new Hiragana(62, "で", "de", "", ""));
		hiraganaList.add(new Hiragana(63, "ど", "do", "", ""));
		hiraganaList.add(new Hiragana(64, "ば", "ba", "", ""));
		hiraganaList.add(new Hiragana(65, "び", "bi", "", ""));
		hiraganaList.add(new Hiragana(66, "ぶ", "bu", "", ""));
		hiraganaList.add(new Hiragana(67, "べ", "be", "", ""));
		hiraganaList.add(new Hiragana(68, "ぼ", "bo", "", ""));
		hiraganaList.add(new Hiragana(69, "ぱ", "pa", "", ""));
		hiraganaList.add(new Hiragana(70, "ぴ", "pi", "", ""));
		hiraganaList.add(new Hiragana(71, "ぷ", "pu", "", ""));
		hiraganaList.add(new Hiragana(72, "ぺ", "pe", "", ""));
		hiraganaList.add(new Hiragana(73, "ぽ", "po", "", ""));
		hiraganaList.add(new Hiragana(74, "きゃ", "kya", "", ""));
		hiraganaList.add(new Hiragana(75, "きゅ", "kyu", "", ""));
		hiraganaList.add(new Hiragana(76, "きょ", "kyo", "", ""));
		hiraganaList.add(new Hiragana(77, "しゃ", "sha", "", ""));
		hiraganaList.add(new Hiragana(78, "しゅ", "shu", "", ""));
		hiraganaList.add(new Hiragana(79, "しょ", "sho", "", ""));
		hiraganaList.add(new Hiragana(80, "ちゃ", "cha", "", ""));
		hiraganaList.add(new Hiragana(81, "ちゅ", "chu", "", ""));
		hiraganaList.add(new Hiragana(82, "ちょ", "cho", "", ""));
		hiraganaList.add(new Hiragana(83, "にゃ", "nya", "", ""));
		hiraganaList.add(new Hiragana(84, "にゅ", "nyu", "", ""));
		hiraganaList.add(new Hiragana(85, "にょ", "nyo", "", ""));
		hiraganaList.add(new Hiragana(86, "ひゃ", "hya", "", ""));
		hiraganaList.add(new Hiragana(87, "ひゅ", "hyu", "", ""));
		hiraganaList.add(new Hiragana(88, "ひょ", "hyo", "", ""));
		hiraganaList.add(new Hiragana(89, "みゃ", "mya", "", ""));
		hiraganaList.add(new Hiragana(90, "みゅ", "myu", "", ""));
		hiraganaList.add(new Hiragana(91, "みょ", "myo", "", ""));
		hiraganaList.add(new Hiragana(92, "りゃ", "rya", "", ""));
		hiraganaList.add(new Hiragana(93, "りゅ", "ryu", "", ""));
		hiraganaList.add(new Hiragana(94, "りょ", "ryo", "", ""));
		hiraganaList.add(new Hiragana(95, "ぎゃ", "gya", "", ""));
		hiraganaList.add(new Hiragana(96, "ぎゅ", "gyu", "", ""));
		hiraganaList.add(new Hiragana(97, "ぎょ", "gyo", "", ""));
		hiraganaList.add(new Hiragana(98, "じゃ", "ja", "", ""));
		hiraganaList.add(new Hiragana(99, "じゅ", "ju", "", ""));
		hiraganaList.add(new Hiragana(100, "じょ", "jo", "", ""));
		hiraganaList.add(new Hiragana(101, "びゃ", "bya", "", ""));
		hiraganaList.add(new Hiragana(102, "びゅ", "byu", "", ""));
		hiraganaList.add(new Hiragana(103, "びょ", "byo", "", ""));
		hiraganaList.add(new Hiragana(104, "ぴゃ", "pya", "", ""));
		hiraganaList.add(new Hiragana(105, "ぴゅ", "pyu", "", ""));
		hiraganaList.add(new Hiragana(106, "ぴょゃ", "pyo", "", ""));
		LOG.info("Hiragana list was loaded.");
	}

	@Override
	public List<Hiragana> findAll() {
		return hiraganaList;
	}

	@Override
	public Hiragana findById(int id) {
		Hiragana hiragana = null;
		
		if(id < 0 || id > hiraganaList.size()) {
			hiragana = new Hiragana(-1, null, null, null, null);
		}else {
			hiragana = hiraganaList.get(id);
		}
		return hiragana;
	}
	
}
