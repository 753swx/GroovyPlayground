package Money


class Money {
    int amount
    String currency

    void plus(int i){
        this.amount = amount + i
    }

    void plus(Money money){
        if(money.currency == this.currency) {
            this.amount += money.amount
        } else if(money.currency == 'BYN' ){
            this.amount += (money.amount/2)
        }else if(money.currency == 'USD' ){
            this.amount += (money.amount*2)
        }
    }
}
