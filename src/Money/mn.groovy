package Money

Money money = new Money(currency: 'USD', amount: 100)
money + 20
Money money1 = new Money(currency:'BYN', amount: 0)

money + money1
println money.amount

money1.plus(money)
println money1.amount

