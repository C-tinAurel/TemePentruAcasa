public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculatorPerimetruPatrat(5));
        System.out.println(calculator.calculatorPerimetruPatrat(3.5));
        System.out.println(calculator.calculatorCircumferintaCerc(4));
        System.out.println(calculator.celMaiMareNumar(8, 5, 2));
        System.out.println(calculator.verificareElementeVector(new int[]{1, 2}));
        System.out.println(calculator.arrayCuVerificareDacaAreElementePare(new int[]{3, 2, 8, 10, 12, 5, 4, 7}));
        System.out.println(calculator.verificareDacaArrayAreNumarImpareDeElemente(new int[]{3, 2, 7}));
        System.out.println(calculator.mijlocArray(new int[]{1, 2, 3, 4, 5, 6, 9, 10, 7}));
    }
}
