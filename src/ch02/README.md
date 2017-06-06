partial vs curry 
https://rhostem.github.io/posts/2017-04-20-curry-and-partial-application/
http://anster.tistory.com/144
- partial: 특정 argument를 고정할때 사용 => ex) f(x,y)에서 x를 10으로 고정한 g(y) 생성, g(y): f(10,x)
- currying: argument가 어러개인 함수를 argument가 1인 함수들로 chaining함
=> ex) f(x,y,z)일때, x => y => z => f(x,y,z)
x = 1, y = 2, z = 3이라고 할때
f(1,y,z) = g(y,z)
g(2,z) = f(1,2,z) = h(z)
h(3) = g(2,3) = f(1,2,3)