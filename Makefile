sample.so:
	gcj -shared -findirect-dispatch -Wl,-Bsymbolic -fPIC -o sample.so sample.java
