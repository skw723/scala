seald modifier: 선언된 파일 안에서만 상속받을 수 있음, 다른 파일에서 사용하는 경우 컴파일 에러
Nill: 엘리먼트가 하나도 없는 리스트 (Nill = List())

공변성(covariant)			C[T’]는 C[T]의 하위 클래스이다	[+T]
반공변성(contravariant)	C[T]는 C[T’]의 하위 클래스이다	[-T]
무공변성(invariant)		C[T]와 C[T’]는 아무 관계가 없다[T]

동반 객체: 자료 형식과 같은 이름의 object로, 자료 형식의 값들을 조작하는 편의 함수를 담는 목적으로 사용(List.scala의 object List)