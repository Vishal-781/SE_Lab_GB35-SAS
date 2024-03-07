class Item:
    _number_of_items = 0

    def __init__(self, item_name, quantity, cprice, sprice):
        self.item_name = item_name
        self._id = Item._number_of_items + 1
        Item._number_of_items = self._id
        self._price = {"cprice": cprice, "sprice": sprice}
        self._quantity = quantity
        self._total_sale = 0
        self._profit = -1 * cprice * quantity
        self._in_stock = quantity > 0

    def change_price(self, price_type, new_price):
        if new_price < 0:
            raise ValueError("Invalid Price")
        self._price[price_type] = new_price
        return {"status": "Success", "message": f"{price_type} Price Updated"}

    def restock(self, quantity):
        if not isinstance(quantity, int) or quantity <= 0:
            raise ValueError("Quantity should be a positive integer")
        self._quantity += quantity
        self._profit -= self._price["cprice"] * quantity
        if not self._in_stock and quantity > 0:
            self._in_stock = True

    def stats(self):
        return {
            "ID": self._id,
            "Name": self.item_name,
            "In Stock": self._in_stock,
            "Cost Price": self._price['cprice'],
            "Selling Price": self._price['sprice'],
            "Quantity": self._quantity,
            "Net Gain": self._profit,
            "Total Sale": self._total_sale
        }

    def sell(self, quantity):
        if not isinstance(quantity, int) or quantity <= 0:
            raise ValueError("Quantity should be a positive integer")
        if self._quantity < quantity:
            return {"status": "Error", "message": "Insufficient Quantity"}
        cost = self._price["sprice"] * quantity
        self._profit += cost
        self._quantity -= quantity
        self._total_sale += quantity
        if self._quantity == 0:
            self._in_stock = False
        return {"status": "Success", "message": "Transaction Completed", "cost": cost}

    def discard(self, quantity):
        if not isinstance(quantity, int) or quantity <= 0:
            raise ValueError("Quantity should be a positive integer")
        if self._quantity < quantity:
            return {"status": "Error", "message": "Insufficient Quantity"}
        self._quantity -= quantity
        if self._quantity == 0:
            self._in_stock = False
        return {"status": "Success", "message": "Item Discarded"}
