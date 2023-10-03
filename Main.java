classDiagram

class Estoque {
  - id: Long
  - nome: String
  - descricao: String
}

class EstoqueItem {
  - id: Long
  - estoque: Estoque
  - produto: Produto
  - quantidade: Integer
  - preco: Double
}

class Produto {
  - id: Long
  - nome: String
  - descricao: String
  - preco: Double
}

class Fornecedor {
  - id: Long
  - nome: String
  - cnpj: String
  - endereco: String
  - telefone: String
}

class Pedido {
  - id: Long
  - cliente: Cliente
  - data: LocalDateTime
  - valorTotal: Double
}

class ItemPedido {
  - id: Long
  - pedido: Pedido
  - produto: Produto
  - quantidade: Integer
  - precoUnitario: Double
}

class Cliente {
  - id: Long
  - nome: String
  - email: String
  - dataNascimento: LocalDate
}

Estoque "1" *-- "1..*" EstoqueItem
EstoqueItem "1" *-- "1" Produto
EstoqueItem "1" *-- "1" Fornecedor
Pedido "1" *-- "1" Cliente
Pedido "1" *-- "1..*" ItemPedido
ItemPedido "1" *-- "1" Produto