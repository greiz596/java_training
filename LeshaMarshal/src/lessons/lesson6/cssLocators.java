package lesson6;

public class cssLocators {
}

/*
в девтул f12 => console

$$("тут селектор")

$$(".className") - класс ищется через точку
$$("#название_id")

$$("[role='значение']") - что-то кроме класса или id ищется в []
$$("[role*='аче']") - * - маска
$$("[role^='зн']") - ^ - по первым буквам
$$("[role$='ие']") - $ - по последним буквам

$$(".className1.className2") - класс\ состоит из нескольких названий
$$(".className1.role[]") - атрибут со значением состоит из нескольких названий

$$("div:not(.col)") -ищем того ,чего не должно содержаться

$$("div[jscontroller='name'] div.className") - ищем одно внутри другого (древовидность), все вхождения ищет

$$("l")


 */