package com.lyceum.conversion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmartCounter {
	
	public static String newCode(String strCode){
		String strInput = strCode;
		String strPattern = "\\d+";
		String strNumberCode = "";
		String strNumberCode2 = "";
		String strReplace = "";
		int intCode;
		Pattern p = Pattern.compile(strPattern);
		Matcher m = p.matcher(strInput);
		StringBuffer sbNewCode = new StringBuffer();
		int intCtrMatcher = 0;
		while (m.find()){
			intCtrMatcher++;
			//System.out.println(m.group());
			//strNumberCode = m.group();
			//m.appendReplacement(sbProjectCode, strNumberCode);
		}//while (m.find())
		m.reset();
		int intCtrChecker = 0;
		while (m.find()){
			intCtrChecker++;
			//System.out.println(intCtrChecker);
			if (intCtrChecker == intCtrMatcher){
				strNumberCode = m.group();
				//System.out.println(strNumberCode);
				intCode = Integer.parseInt(strNumberCode);
				intCode++;
				//System.out.println(intCode);
				strReplace = Integer.toString(intCode);
				int intCtr;
				for (intCtr = strReplace.length(); intCtr < strNumberCode.length(); intCtr++){
					if (intCtr == strReplace.length()){
						strNumberCode2 = "0";
					}//if (intCtr == strNumberCode2.length())
					else{
						strNumberCode2 = strNumberCode2.concat("0");
					}//else
				}//for (int intCtr = strNumberCode2.length(); intCtr < strNumberCode.length(); intCtr++)
				if (intCtr == strReplace.length()){
					//System.out.println(strReplace);
					strNumberCode2 = strReplace;
				}else{
					//System.out.println(strReplace);
					strNumberCode2 = strNumberCode2.concat(strReplace);
				}
				
				if (strNumberCode2.length() > strNumberCode.length()){
					sbNewCode = null;
					break;
				}//if (strProjectCode.length() > strNumberCode.length())
				m.appendReplacement(sbNewCode, strNumberCode2);
				}
		}
		m.appendTail(sbNewCode);
		return sbNewCode.toString();
	}
	
}
