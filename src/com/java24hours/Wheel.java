package com.java24hours;

public class Wheel {
    public static void main(String[] args) {
        String phrase[] = {
                "ВСЫПАТЬ ПО ПЕРВОЕ ЧИСЛО",
                "ГНАТЬСЯ ЗА ДЛИННЫМ РУБЛЕМ",
                "В ЧАС ПО ЧАЙНОЙ ЛОЖКЕ",
                "КАЖДЫЙ КУЛИК СОВЕ БОЛОТО ХВАЛИТ",
                "ЗА ТРИДЕВЯТЬ ЗЕМЕЛЬ",
                "ЗА ДУШОЙ НИЧЕГО НЕТ",
                "СЕМЬ ПЯДЕЙ ВО ЛБУ",
                "ПРИНЦ НА БЕЛОМ КОНЕ",
        };
        int letterCount[] = new int[32];
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char letters[] = current.toCharArray();
            for (int i = 0; i< letters.length; i++){
                char lett = letters[i];
                if( (lett >= 'А') & (lett <= 'Я')){
                    letterCount[lett -'А']++;
                }
            }
        }
        for (char count = 'А';count <= 'Я'; count++){
            System.out.print(count + ": " + letterCount[count - 'А'] + " ");
            if (count == 'М') {
                System.out.println();
            }
        }
        System.out.println();

    }
}
