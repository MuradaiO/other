class MenuItem:

    def __init__(self , name, price):
        self.name = name
        self.price = price
#商品リスト用
    def info(self)
    print(self.name + ':¥' + self.price)

#支払総額用の関数
    def get_total_price(self, count):
        total_price = name.price * count

        #OO個以上買われた際の割引率
        if count >= 3:
          self.price *= 0.8

        return total_price
