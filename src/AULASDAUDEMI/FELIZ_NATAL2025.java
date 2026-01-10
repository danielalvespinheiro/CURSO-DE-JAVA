package AULASDAUDEMI;

public class FELIZ_NATAL2025 {

	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BOLD = "\u001B[1m";

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
	public static void main(String[] args) {
		StringBuilder text = new StringBuilder();

        text.append("   FELIZ NATAL!\n\n");

        int rows = 9;
        int starCount = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = rows - i; j >= 2; j--) {
                text.append(" ");
            }

            for (int j = 0; j <= i; j++) {

                if (starCount == 0) {
                    text.append(ANSI_BOLD)
                        .append(ANSI_YELLOW)
                        .append("* ")
                        .append(ANSI_RESET);
                } else {
                    switch (starCount % 3) {
                        case 0:
                            text.append(ANSI_GREEN);
                            break;
                        case 1:
                            text.append(ANSI_RED);
                            break;
                        case 2:
                            text.append(ANSI_BLUE);
                            break;
                    }

                    text.append("* ")
                        .append(ANSI_RESET);
                }

                starCount++;
            }

            text.append("\n");
        }

        System.out.println(text.toString());
    }

}
