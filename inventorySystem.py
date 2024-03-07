from item import Item

class Inventory:
    def __init__(self):
        self.itemListById = {}
        self.itemListByName = {}

    def addNewItem(self, itemName, quantity, cprice, sprice):
        newItem = Item(itemName, quantity, cprice, sprice)
        self.itemListById[newItem._id] = newItem
        self.itemListByName[newItem.item_name] = newItem

    def searchItem(self, **kwargs):
        if "id" in kwargs:
            return {"status": "Success",
                    "mess": "Item Found",
                    "item": self.itemListById.get(kwargs["id"], None)}
        elif "name" in kwargs:
            return {"status": "Success",
                    "mess": "Item Found",
                    "item": self.itemListByName.get(kwargs["name"], None)}

class InventorySystem:
    def __init__(self, isManager):
        self.inventory = Inventory()
        self.isManager = isManager

    def addItems(self, num):
        for _ in range(num):
            name = input("Item Name: ")
            cprice = float(input("Item Cost price: "))
            sprice = float(input("Item Selling price: "))
            quantity = int(input("Item Quantity: "))
            self.inventory.addNewItem(itemName=name,
                                      quantity=quantity,
                                      cprice=cprice,
                                      sprice=sprice)

    def restockItem(self):
        searchType = input("Operate By id or name: ")
        value = input("Input item value: ")
        if searchType == 'id':
            value = int(value)
        quantity = int(input("Input item quantity: "))
        item_data = self.inventory.searchItem(**{searchType: value})
        if item_data["item"]:
            item_data["item"].restock(quantity)
            return {"status": "Success", "message": f"{quantity} items restocked"}
        else:
            return {"status": "Error", "message": "Item not found"}

    def removeItem(self, action):
        searchType = input("Operate By id or name: ")
        value = input("Input item value: ")
        if searchType == 'id':
            value = int(value)
        quantity = int(input("Input item quantity: "))
        item_data = self.inventory.searchItem(**{searchType: value})
        if item_data["item"]:
            if action == "sell":
                return item_data["item"].sell(quantity)
            elif action == "discard":
                return item_data["item"].discard(quantity)
        else:
            return {"status": "Error", "message": "Item not found"}

    def statview(self):
        searchType = input("Operate By id or name: ")
        value = input("Input item value: ")
        item_data = self.inventory.searchItem(**{searchType: value})
        if item_data["item"]:
            return item_data["item"].stats()
        else:
            return {"status": "Error", "message": "Item not found"}
