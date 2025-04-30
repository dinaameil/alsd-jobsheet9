public class StackSurat {
    Surat[] stack;
    int top;

    public StackSurat(int kapasitas) {
        stack = new Surat[kapasitas];
        top = -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh. Tidak dapat menambahkan surat.");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            Surat s = stack[top];
            stack[top] = null;
            top--;
            return s;
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampilSurat();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
