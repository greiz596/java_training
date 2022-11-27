package lesson5;



/*
абсолютный путь, пример www.google.com: /html/body/div...

Относительный путь, пример www.google.com:

//div - двойной слеш - "поиск всех элементов"
//div[] - в квадратных скобках - параметры поиска
//div[@class='значение'][5] - 5 - порядковый номер
//div[@class='значение'][last()];
//span[text()='значение текста'] - поиск по тексту,  * - маска (всё)
//span[contains(text(),'значение')];
//span[contains(@class,'значение')]/../.. - две точки - значит на уровень выше
//span[contains(@class,'значение')]/parent::div - подняться на уровень выше к родителю (?)
*/

public class xpathLocators {
}
