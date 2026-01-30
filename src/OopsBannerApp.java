public class OopsBannerApp {
    public static void main(String[] args) {
        String[] lines = {
                String.join(" ","  ***  ", "    ***  ", "******", " **** "),
                String.join(" ", " **   **", " **   **", "**   **", "**    "),
                String.join(" ", " **   **", " **   **", "**   **", "**    "),
                String.join(" ", " **   **", " **   **", "******", " **** "),
                String.join(" ", " **   **", " **   **", "**     ", "    **"),
                String.join(" ", " **   **", " **   **", "**     ", "    **"),
                String.join(" ", "  ***  ", "  ***  ", "**     ", "**** ")
        };

        // Use enhanced for loop to print each banner line
        for (String line : lines) {
            System.out.println(line);
        }
    }
    }

