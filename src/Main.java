

void main(){
    Scanner sc = new Scanner(System.in);
    int[][] matice;

    System.out.print("Napište počet řádků a sloupců matice: ");

    int radky = sc.nextInt();
    int sloupce = sc.nextInt();

    matice = new int[radky][sloupce];

    // Pro každý prvek se ptáme uživatele na hodnotu
    for (int i = 0; i < matice.length; i++) {
        for (int j = 0; j < matice[i].length; j++) {
            System.out.format("Napište hodnotu prvku [%d, %d]: ", i, j);
            matice[i][j] = sc.nextInt();
        }
    }

    // Vypíšeme každý prvek
    for (int i = 0; i < matice.length; i++) {
        for (int j = 0; j < matice[i].length; j++) {
            System.out.format("%4d ", matice[i][j]);
        }
        System.out.println();
    }
}

