public class ParentesisValidation {
    public static void main(String[] args) {

        String prueba = "()()";
        System.out.println(validation(prueba));

    }
    public static boolean validation(String textoAEvaluar){
        boolean resultado = false;
        long closeParentesis = textoAEvaluar.chars().filter(chara -> chara == ')').count();
        long openParentesis = textoAEvaluar.chars().filter(chara -> chara == '(').count();
        int stringLength = textoAEvaluar.length();
        char firstCharacter = textoAEvaluar.charAt(0);
        char lastCharacter = textoAEvaluar.charAt(stringLength-1);
        char[] openList = new char[stringLength];

        if ((stringLength % 2 != 0) || (firstCharacter == ')') || (openParentesis != closeParentesis) || (lastCharacter == '(')) {
            resultado = false;
        } else {
            for (int i = 0; i < stringLength; i++) {
                if (i == 0){
                    openList[i] = textoAEvaluar.charAt(i);
                } else {
                    resultado = true;
                }
            }

        }
        return resultado;
    }
}
