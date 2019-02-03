package com.uniovi.sdi;

public class Contador {
int total;

public void setIncremento(int visitas) {
	total+=visitas;
}

public int getTotal() {
	return total;
}
}
