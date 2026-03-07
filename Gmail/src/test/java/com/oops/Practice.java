package com.oops;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

	public static void main(String[] args) {

		String log = "[  1.867176] hub 2-2:1.0: USB hub found  \r\n"
				+ "   [    1.873186] hub 2-2:1.0: 7 ports detected\r\n"
				+ "   [    2.439885] SGI XFS with ACLs, security attributes, no debug enabled\r\n"
				+ "   [    2.441467] random: crng init done\r\n"
				+ "   [    2.441678] XFS (dm-0): XFS Mounting V5 Filesystem`";
		
		Pattern pattern = Pattern.compile("\\b(hub|SGI XFS|XFS)\\b");
        Matcher matcher = pattern.matcher(log);

        Map<String, Integer> countMap = new HashMap<String, Integer>();

        while (matcher.find()) {
            String word = matcher.group();
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        // Print count
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
	}
	
}