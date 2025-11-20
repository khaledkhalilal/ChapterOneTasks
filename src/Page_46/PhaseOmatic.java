package Page_46;

public class PhaseOmatic {
    public static void main(String[] args){
        String[] wordListOne={"круглосуточный", "грех-звенный", "30000-футовый",
                "взаимный", "обходный выигрыш", "фронтанд", "на основе веб-технологий",
                "проникающий", "умный", "вность сити", "метод критического пути",
                "динамичный"};
        String[] wordListTwe={"уполномоченный", "трудный", "чистый продукт",
                "ориентированный", "центральный", "распределенный", "кластеризованный",
                "ферменный", "нестандартный ум", "повыционированный", "селеной",
                "сфокусированный", "использованный с выгодой", "выровненный",
                "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree={"процесс", "пункт разгрузки", "выход из положения",
                "тип структуры", "галани", "подход", "уровень завоеванного внимания",
                "портал", "период времени", "обзор", "образец", "пункт следования"};
        int OneLength=wordListOne.length;
        int tweLength=wordListOne.length;
        int threeLength=wordListOne.length;

        int rand1= (int) (Math.random() * OneLength);
        int rand2 =(int)(Math.random() * tweLength);
        int rand3 =(int)(Math.random() * threeLength);

        String phase = wordListOne[rand1] +" "+wordListTwe[rand2]+" " +wordListThree[rand3];

        System.out.println("все, что я нам нужно,"+ phase);
    }
}
