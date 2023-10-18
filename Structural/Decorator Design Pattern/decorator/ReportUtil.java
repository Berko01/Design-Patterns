package decorator;

import java.util.ArrayList;
import java.util.List;

public class ReportUtil {

    public static String getStripedText(String text) {
        String[] lineList = text.split("\n");

        String stripedText = "";

        for (String eachLine : lineList) {

            String stripedLine = addLineToEachLine(eachLine);

            stripedText += stripedLine;
        }

        return stripedText;
    }

    private static String addLineToEachLine(String eachLine) {

        String newLine = "";

        if (eachLine.trim().length() == 0) {

            newLine = "\n";
        } else {
            newLine = "\n- " + eachLine;
        }
        return newLine;

    }

    public static String fitText(String text, int width) {

        String smallLineText = "";

        String[] lineList = text.split("\n");

        for (String eachLine : lineList) {
            if (eachLine.length() <= width) {
                // aynen ekle
                smallLineText = addAndMoveToNewLine(smallLineText, eachLine);
            } else {
                // küçült ekle
                List<String> splittedList = splitText(eachLine, width);

                for (String eachNewLine : splittedList) {
                    smallLineText = addAndMoveToNewLine(smallLineText, eachNewLine);
                }
            }
        }

        return smallLineText;
    }

    // genislik = 30
    // satir;
    // 1 -> 45 -> (30,15) -> 0,30 / 30/45
    // 2 -> 25 -> (25) -> 0,25
    // 3 -> 45 -> (30,15) -> 0,30 / 30,60 / 60,65
    // @param eachSatir
    // @param genislik
    // @return

    private static List<String> splitText(String eachLine, int width) {
        List<String> splittedLineList = new ArrayList<>();
        for (int i = 0; i <= eachLine.length() / 30; i++) {
            int firstDigit = width + i;
            int lastDigit = firstDigit + width;

            if (lastDigit > eachLine.length())
                lastDigit = eachLine.length();

            String splittedLine = eachLine.substring(firstDigit, lastDigit);

            if (splittedLine.trim().length() > 0) {
                splittedLineList.add(splittedLine);
            }

        }

        return splittedLineList;

    }

    private static String addAndMoveToNewLine(String mainText, String textToAdd) {
        return mainText = mainText + textToAdd + "\n";
    }

    public static String addSignedTextAtTheEnd(String text) {
        String signature = "\n\n " + "\t\t\t Imza: ";

        return text + signature;
    }

}
