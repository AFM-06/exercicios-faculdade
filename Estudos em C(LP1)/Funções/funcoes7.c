int mdc(int a, int b){
    while (b != 0){
        int resto = a % b;
        a = b;
        b = resto;  
    }
    return a;
}