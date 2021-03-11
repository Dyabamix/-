public class Quatz {

    public static void main(String[] args) {
        
        String[] roles = {"Городничий", "Аммос Федорович", "Лука", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Лука: Лука Лукич: Вот он пиздец!!!",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder textPerRole = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            textPerRole.append(roles[i] + ":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ": ")) {
                    textPerRole.append((j + 1) + ") " + textLines[j].replace(roles[i] + ": ", "") + "\n");
                }
            }
            textPerRole.append("\n");
        }
        return textPerRole.toString();
    }
}
