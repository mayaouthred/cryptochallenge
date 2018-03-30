package cipher;

public class Key {
	private char a;
	private char b;
	private char c;
	private char d;
	private char e;
	private char f;
	private char g;
	private char h;
	private char i;
	private char j;
	private char k;
	private char l;
	private char m;
	private char n;
	private char o;
	private char p;
	private char q;
	private char r;
	private char s;
	private char t;
	private char u;
	private char v;
	private char w;
	private char x;
	private char y;
	private char z;
	private char nullChar;

	public Key() {
		/*
		 * a = (Character) null; b = (Character) null; c = (Character) null; d =
		 * (Character) null; e = (Character) null; f = (Character) null; g =
		 * (Character) null; h = (Character) null; i = (Character) null; j =
		 * (Character) null; k = (Character) null; l = (Character) null; m =
		 * (Character) null; n = (Character) null; o = (Character) null; p =
		 * (Character) null; q = (Character) null; r = (Character) null; s =
		 * (Character) null; t = (Character) null; u = (Character) null; v =
		 * (Character) null; w = (Character) null; x = (Character) null; y =
		 * (Character) null; z = (Character) null;
		 */
	}

	public char[] toArray() {
		char[] key = new char[26];
		if (a != nullChar) {
			key[0] = a;
		} else {
			key[0] = '#';
		}
		if (b != nullChar) {
			key[1] = b;
		} else {
			key[1] = '#';
		}
		if (c != nullChar) {
			key[2] = c;
		} else {
			key[2] = '#';
		}
		if (d != nullChar) {
			key[3] = d;
		} else {
			key[3] = '#';
		}
		if (e != nullChar) {
			key[4] = e;
		} else {
			key[4] = '#';
		}
		if (f != nullChar) {
			key[5] = f;
		} else {
			key[5] = '#';
		}
		if (g != nullChar) {
			key[6] = g;
		} else {
			key[6] = '#';
		}
		if (h != nullChar) {
			key[7] = h;
		} else {
			key[7] = '#';
		}
		if (i != nullChar) {
			key[8] = i;
		} else {
			key[8] = '#';
		}
		if (j != nullChar) {
			key[9] = j;
		} else {
			key[9] = '#';
		}
		if (k != nullChar) {
			key[10] = k;
		} else {
			key[10] = '#';
		}
		if (l != nullChar) {
			key[11] = l;
		} else {
			key[11] = '#';
		}
		if (m != nullChar) {
			key[12] = m;
		} else {
			key[12] = '#';
		}
		if (n != nullChar) {
			key[13] = n;
		} else {
			key[13] = '#';
		}
		if (o != nullChar) {
			key[14] = o;
		} else {
			key[14] = '#';
		}
		if (p != nullChar) {
			key[15] = p;
		} else {
			key[15] = '#';
		}
		if (q != nullChar) {
			key[16] = q;
		} else {
			key[16] = '#';
		}
		if (r != nullChar) {
			key[17] = r;
		} else {
			key[17] = '#';
		}
		if (s != nullChar) {
			key[18] = s;
		} else {
			key[18] = '#';
		}
		if (t != nullChar) {
			key[19] = t;
		} else {
			key[19] = '#';
		}
		if (u != nullChar) {
			key[20] = u;
		} else {
			key[20] = '#';
		}
		if (v != nullChar) {
			key[21] = v;
		} else {
			key[21] = '#';
		}
		if (w != nullChar) {
			key[22] = w;
		} else {
			key[22] = '#';
		}
		if (x != nullChar) {
			key[23] = x;
		} else {
			key[23] = '#';
		}
		if (y != nullChar) {
			key[24] = y;
		} else {
			key[24] = '#';
		}
		if (z != nullChar) {
			key[25] = z;
		} else {
			key[25] = '#';
		}
		return key;
	}

	public char getA() {
		return a;
	}

	public char getB() {
		return b;
	}

	public char getC() {
		return c;
	}

	public char getD() {
		return d;
	}

	public char getE() {
		return e;
	}

	public char getF() {
		return f;
	}

	public char getG() {
		return g;
	}

	public char getH() {
		return h;
	}

	public char getI() {
		return i;
	}

	public char getJ() {
		return j;
	}

	public char getK() {
		return k;
	}

	public char getL() {
		return l;
	}

	public char getM() {
		return m;
	}

	public char getN() {
		return n;
	}

	public char getO() {
		return o;
	}

	public char getP() {
		return p;
	}

	public char getQ() {
		return q;
	}

	public char getR() {
		return r;
	}

	public char getS() {
		return s;
	}

	public char getT() {
		return t;
	}

	public char getU() {
		return u;
	}

	public char getV() {
		return v;
	}

	public char getW() {
		return w;
	}

	public char getX() {
		return x;
	}

	public char getY() {
		return y;
	}

	public char getZ() {
		return z;
	}

	public void setA(char c) {
		a = c;
	}

	public void setB(char c) {
		b = c;
	}

	public void setC(char C) {
		c = C;
	}

	public void setD(char c) {
		d = c;
	}

	public void setE(char c) {
		e = c;
	}

	public void setF(char c) {
		f = c;
	}

	public void setG(char c) {
		g = c;
	}

	public void setH(char c) {
		h = c;
	}

	public void setI(char c) {
		i = c;
	}

	public void setJ(char c) {
		j = c;
	}

	public void setK(char c) {
		k = c;
	}

	public void setL(char c) {
		l = c;
	}

	public void setM(char c) {
		m = c;
	}

	public void setN(char c) {
		n = c;
	}

	public void setO(char c) {
		o = c;
	}

	public void setP(char c) {
		p = c;
	}

	public void setQ(char c) {
		q = c;
	}

	public void setR(char c) {
		r = c;
	}

	public void setS(char c) {
		s = c;
	}

	public void setT(char c) {
		t = c;
	}

	public void setU(char c) {
		u = c;
	}

	public void setV(char c) {
		v = c;
	}

	public void setW(char c) {
		w = c;
	}

	public void setX(char c) {
		x = c;
	}

	public void setY(char c) {
		y = c;
	}

	public void setZ(char c) {
		z = c;
	}
}
