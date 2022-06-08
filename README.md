# Stepic_Start_in_Java
####################################################################
# Раздел 3.3 - задача 4 (class 3_3__4)
Задача повышенной сложности

На числовой прямой даны два отрезка, заданных парами целых чисел: [a1, b1] и [a2, b2] Напишите программу, которая находит их пересечение.

Если пересечение - отрезок, необходимо вывести два числа (границы отрезка), если единственная точка - единственное число (точку), если пересечения нет - вывести фразу "Пересечения нет" (без кавычек). 

Sample Input 1:

2 5
6 10
Sample Output 1:

Пересечения нет
Sample Input 2:

2 5
4 10
Sample Output 2:

4 5
#########################################################################
# Раздел 3.3 - задача 5 (class 3_3__5)
На вход подаётся три целых числа. Выведите максимальное чётное из них. Если чётных чисел нет, выведите "Чётных чисел нет".

Sample Input:

5 10 15
Sample Output:

10
#######################################################################
# Раздел 3.4 - задача 5 (class 3_4__5)
Реализуйте простой справочник по командам Java. На вход подаётся команда, по которой необходима справка (ограничимся тремя командами). В соответствии с этим выведите текст:

Ввод: System.out.println()

Вывод: Это команда вывода на печать

Ввод: if

Вывод: Это условный оператор

Ввод: else

Вывод: Это альтернативная конструкция условного оператора



Если введено что-либо другое, выведите фразу "" (без кавычек).

Sample Input:

System.out.println()
Sample Output:

Это команда вывода на печать

========================================================================
# Раздел 3.5 - задача 2 (class 3_5__2)
На вход подаётся  целое число. Выведите "YES", если введено трёхзначное положительное число, а в противном случае - "NO".

Sample Input 1:

125
Sample Output 1:

YES
Sample Input 2:

1
Sample Output 2:

NO

###########################################################################

# Раздел 3.5 - задача 3 (class 3_5__3)

На вход подается строка, а затем слово. Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.

Sample Input:

abracadabra
Cadabra
Sample Output:

true

###########################################################################

# Раздел 3.5 - задача 4 (class 3_5__4)
На вход подаётся целое трёхзначное число, а затем цифра. Выведите true, если эта цифра является средней в числе (разряд десятков), и false - если нет. Если введённое число не является трёхзначным, выведите "error".

Sample Input:

123 2
Sample Output:

true

###########################################################################

# Раздел 3.5 - задача 7 (class 3_5__7)

На вход подаются координаты точки x, y. Определите, попадает ли точка в заштрихованную область.
y = x; 
y = 2 - x^2;

Выведите "Yes", если попадает, и "No" - в противном случае.

Примечание. Считать, что граница принадлежит заштрихованной области.

Sample Input:

-0.5
0.5
Sample Output:

Yes
##################################################################

#Раздел 3.5 - задача 8 (class 3_5__8)

Богатейшие люди Земли решили создать тайное мировое правительство  ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶н̶е̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶ ̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶. В кабинет совещаний могут войти только те, кто указан в специальном списке: Джефф Безос, Илон Маск,  Марк Цукерберг, Билл Гейтс. Чтобы получить допуск, нужно сказать фразу-приветствие. Если фраза-приветствие содержит имя из списка, проход разрешается. Если же нет - проход блокируется.

На ввод подаётся фраза-приветствие. Выведите "Добро пожаловать!", если имя есть в списке, и "Здесь никого нет, Вы ошиблись дверью" - если нет.

Примечание. Буква "ё".

Sample Input 1:

Это я, Билл Гейтс
Sample Output 1:

Добро пожаловать!
Sample Input 2:

Открывай, Абрамович пришёл!
Sample Output 2:

Здесь никого нет, Вы ошиблись дверью

########################################################################

#Раздел 3.5 - задача 9 (class 3_5__9)

На вход подаётся слово. Выведите словами количество букв в этом слове. Если букв больше пяти - выведите "Длинное слово".

Sample Input:

в
Sample Output:

Одна буква

That's all