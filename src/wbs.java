/* 
 *  A simple commandline programm to search for german words
 *  Copyright (C) 2019 Erik Langenberg
 *  
 *  This library is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU Lesser General Public License as published by the 
 *  Free Software Foundation; either version 2.1 of the License, or 
 *  (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful, but WITHOUT 
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 *  FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License  
 *  for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License 
 *  along with this library; if not, write to the Free Software Foundation, 
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 */
package WBS;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WBS {
    public static void main(String[] args) {
        String fileName = "deWl.txt";
        String regString = "";
        List<String> wordListDe = new ArrayList<String>();
        
        if (args.length == 1) {
            regString = args[0];
        } 
        System.out.println("Regulärer Ausdruck \t= "+regString);
        Pattern p = Pattern.compile(regString);

        wordListDe = getWordList(fileName);
        System.out.println("Wörterbuchlänge \t= " + wordListDe.size());

        final List<String> resultList = wordListDe
                .stream()
                .filter(word -> p.matcher(word).matches()).collect(Collectors.toList());
        resultList.forEach(word -> System.out.println("Mögliches Wort = " + word));

        System.out.println("Mögliche Wörter \t= " + resultList.size());
    }

    private static List<String> getWordList(String fileName) {
        List<String> wordListDe = new ArrayList();

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        System.out.println("Wörterbuch gefunden\t= " + file.exists());

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                wordListDe.add(line);
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordListDe;
    }

}
