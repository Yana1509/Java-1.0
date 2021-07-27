public class TaskWork12 {
    public static void main(String[] args) {
        String a = "I like Java!!!";
        System.out.println("Строка содержит 'Java': "+ a.contains("Java"));
        System.out.println("Строка начинается с 'I like': "+ a.startsWith("I like"));
        System.out.println("Строка заканчивается '!!!': "+ a.endsWith("!!!"));
        if (a.contains("Java") & a.startsWith("I like") & a.endsWith("!!!")) {
                    System.out.println(a.toUpperCase());
                }
                else {
            System.out.println();
            }
        String result = a.replace("a",  "o");
        System.out.println(result.substring(7, 11));
        }
        }

