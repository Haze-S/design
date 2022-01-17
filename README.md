# Design Pattern

#### GoF 디자인 패턴

## 생성 패턴

객체를 생성하는 것과 관련된 패턴으로 객체의 생성과 변경이 전체 시스템에 미치는 영향을 최소화하고 코드의 유연성을 높여준다.

- Factory Method
<details>
<summary>Singleton</summary>
<div markdown="1">
  
  어떠한 클래스(객체)가 유일하게 1개만 존재할 때 사용한다.
  
  주로 서로 자원을 공유 할 때 사용하는데, 실물 세계에서는 프린터가 해당되며 실제 프로그래밍에서는 TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용한다.

  ![image](https://user-images.githubusercontent.com/87344625/149797919-e10c12ff-0e0a-480a-bddf-9473b9f054c6.png)
  
</div>
</details>

- Prototype
- Builder
- Abstract Factory
- Chaining

## 구조 패턴

프로그램 내의 자료구조나 인터페이스 구조 등 프로그램 구조를 설계하는데 활용 될 수 있는 패턴

클래스, 객체들의 구성을 통해서 더 큰 구조를 만들 수 있게 해준다.

큰 규모의 시스템에서는 많은 클래스들이 서로 의존성을 가지게 되는데, 이런 복잡한 구조를 개발하기 쉽게 만들어주고 유지보수하기 쉽게 만들어준다.

<details>
<summary>Adapter</summary>
<div markdown="1">
  
  실생활에서는 100v를 220v로 변경해주거나 그 반대로 해주는 돼지코 변환기를 예로 들 수 있다.
  
  호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.
  
  SOLID 중에서 개방폐쇄 원칙(OCP)를 따른다.

  ![image](https://user-images.githubusercontent.com/87344625/149798432-32a6f69b-3326-4ccc-b025-a07bcfe679c8.png)
  
</div>
</details>

- Composite
- Bridge
 
<details>
<summary>Decorator</summary>
<div markdown="1">
  
  기존 뼈대(클래스)는 유지하되 이후 필요한 형태로 꾸밀 때 사용한다.

  확장이 필요한 경우 상송의 대안으로 활용

  SOLID중에서 개방폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)를 따른다.

  ![image](https://user-images.githubusercontent.com/87344625/149798598-bd7c3b46-6daf-4e94-a8b6-abba23332262.png)
  
</div>
</details>

<details>
<summary>Facade</summary>
<div markdown="1">

  건물의 앞쪽 정면이라는 뜻을 가진다. 

  여러 개의 객체와 실제 사용하는 서브 객체 사이에 복잡한 의존관계가 있을 때, 중간에 facade라는 객체를 두고 여기서 제공하는 interface만을 활용하여 기능을 사용하는 방식이다. 

  facade는 자신이 가지고 있는 각 클래스의 기능을 명확히 알아야 한다.
  
  ![image](https://user-images.githubusercontent.com/87344625/149798726-6ee141e0-f922-4806-925c-98600e1ebc6b.png)
  
</div>
</details>

- Flyweight

<details>
<summary>Proxy</summary>
<div markdown="1">
  
  대리인이라는 뜻으로 뭔가를 대신해서 처리하는 것

  Proxy Class를 통해서 대신 전달하는 형태로 설계되며 실제 Client는 Proxy로부터 결과를 받는다.

  Cache의 기능으로도 활용이 가능하다.

  SOLID중에서 개방폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)을 따른다.

  ![image](https://user-images.githubusercontent.com/87344625/149799180-298dbbe0-d62a-4771-8892-345e5cf5964f.png)
  
</div>
</details>

## 행위 패턴

반복적으로 사용되는 객체들의 상호작용을 패턴화한 것으로, 클래스나 객체들이 상호작용하는 방법과 책임을 분산하는 방법을 제공한다. 행위 패턴은 행위 관련 패턴을 사용하여 독립적으로 일을 처리하고자 할 때 사용한다.

- Template Method
- Interpreter
- Iterator

<details>
<summary>Observer</summary>
<div markdown="1">
  
  관찰자 패턴은 변화가 일어났을 때, 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것이다. 
  
  event listener에서 해당 패턴을 사용하고 있다.

  ![image](https://user-images.githubusercontent.com/87344625/149799310-5650323a-d699-4fd3-a069-3c8a016e22e6.png)
  
</div>
</details>

<details>
<summary>Strategy</summary>
<div markdown="1">
  
  전략 패턴으로 불리며 객체지향의 꽃이다.

  유사한 행위들을 캡슐화하여 객체의 행위를 바꾸고 싶은 경우 직접 변경하는 것이 아닌 전략만 변경하여 유연하게 확장하는 패턴. SOLID중에서 개방폐쇄 원칙(OCP)과 의존 역전 원칙(DIP)를 따른다.

  ![image](https://user-images.githubusercontent.com/87344625/149799432-5e7f2e12-eeb9-4b41-b5aa-87aa3dd95619.png)
  
</div>
</details>

- Visitor
- Chain of responsibility
- Command
- Mediator
- State
- Memento
