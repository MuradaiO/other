from menu_item import MenuItem

money = 2000

#商品リスト

menu_item1 = MenuItem('バラ',350)
menu_item2 = MenuItem('カーネーション', 250)
menu_item3 = MenuItem('トルコキキョウ', 700)

index= 0

menu_items = [menu_item1, menu_item2, menu_item3]

for menu_item in menu_items:
    print(str(index) + '.' + menu_item1.info())
    index += 0

#注文を受け付ける
print('--------------------')
print('財布には' + str(money) + '円入っています')

order = int(input('何かお探しでしょうか：'))
selected_menu = menu_item [order]
print('選択されたお花：' + selected_menu)

count = int(input('個数を入力してください(3つ以上で2割引): ')):
result = selected_menu.get_total_price[order]

print('合計は' + str(result) + '円です')

#支払の処理
if money >= result:
    print(selected_menu + 'を' + count + '個買いました')
    money -= total_price

    if  money == 0:
        print('財布が空になりました')
        break
else:
    print('お金が足りませんでした')
print('残金は' + str(money) +'です')
