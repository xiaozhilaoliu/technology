package main

import "fmt"

type Vertex struct {
	X int
	Y int
}

func structFun() {
	fmt.Println(Vertex{10, 10})
}

func structFunPoint ()  {
	v := Vertex{23,10}
	p := &v
	p.X = 15
	fmt.Println(v)

}

func sructVarFun()  {
	var (
		v1 = Vertex{1,2}
		v2 = Vertex{X:1}
		v3 = Vertex{Y:3}
		p = &Vertex{1,2}
	)

	fmt.Println(v1,v2,v3,*p)
}
func main() {
	structFun();
	structFunPoint();
	sructVarFun();
}


