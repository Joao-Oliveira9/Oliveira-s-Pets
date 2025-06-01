
# 🐾 Sistema Pet Shop - API

Este projeto gerencia o fluxo de um pet shop, incluindo cadastro de clientes, animais, controle de estoque, agendamento e execução de serviços.

---

## 📚 Funcionalidades

- Cadastro de clientes
- Cadastro de animais vinculados a clientes
- Cadastro de tipos de animais aceitos
- Registro de compras e baixa de produtos no estoque
- Atualização e entrada de novos produtos no estoque
- Exibição e agendamento de horários para serviços
- Designação manual de funcionário para execução de serviços
- Registro da conclusão de serviços no histórico geral

---

## 🚀 Endpoints

### ➡️ Cadastro de Cliente

**POST** `/clientes`

**Request:**
```json
{
  "nome_do_cliente": "João da Silva",
  "cpf": "12345678900",
  "email": "joao@email.com",
  "telefone": "11999999999"
}
```

**Response:**
```json
{
  "status": "success",
  "message": "Cliente cadastrado com sucesso."
}
```

---

### ➡️ Cadastro de Animal

**POST** `/animais`

**Request:**
```json
{
  "nome_do_animal": "Rex",
  "tipo": "Cachorro",
  "idade": 5,
  "porte": "Médio"
}
```

**Response:**
```json
{
  "status": "success",
  "message": "Animal cadastrado com sucesso."
}
```

---

### ➡️ Pesquisar Cliente

**GET** `/clientes`

**Request (Query Params):**
```
/clientes?cpf=12345678900
```

**Response:**
```json
{
  "status": "success",
  "message": "Cliente encontrado.",
  "dados": {
    "nome_do_cliente": "João da Silva",
    "email": "joao@email.com",
    "telefone": "11999999999"
  }
}
```

---

### ➡️ Cadastro de Tipo de Animal

**POST** `/tipos-animal`

**Request:**
```json
{
  "tipo_animal": "Gato"
}
```

**Response:**
```json
{
  "status": "success",
  "message": "Tipo de animal cadastrado com sucesso."
}
```

---

### ➡️ Baixa de Produto (Compra)

**DELETE** `/produtos`

**Request:**
```json
{
  "ean13": "7891234567895"
}
```

**Response:**
```json
{
  "status": "success",
  "message": "Produto baixado do estoque."
}
```

---

### ➡️ Atualizar/Adicionar Produto no Estoque

**POST** `/produtos`

**Request:**
```json
{
  "ean13": "7891234567895",
  "nome": "Ração Premium",
  "preco": 79.90,
  "categoria": "Alimentação",
  "marca": "MarcaX",
  "fornecedor": "FornecedorY"
}
```

**Response:**
```json
{
  "status": "success",
  "message": "Produto adicionado ao estoque."
}
```

---

### ➡️ Expor Horários Disponíveis

**GET** `/horarios`

**Request:**
*(Sem body)*

**Response:**
```json
{
  "horarios": [
    {
      "funcionario": "Carlos",
      "data_inicio": "2025-04-30T10:00:00"
    },
    {
      "funcionario": "Ana",
      "data_inicio": "2025-04-30T11:00:00"
    }
  ]
}
```

---

### ➡️ Marcar Horário para Serviço

**POST** `/horarios`

**Request:**
```json
{
  "horario_inicio": "2025-04-30T10:00:00"
}
```

**Response:**
```json
{
  "status": "success",
  "message": "Horário marcado com sucesso."
}
```

---

### ➡️ Conclusão de Serviço

**PATCH** `/historico`

**Request:**
```json
{
  "horario_inicio": "2025-04-30T10:00:00",
  "funcionario": "Carlos"
}
```

**Response:**
```json
{
  "status": "success",
  "message": "Serviço concluído e registrado no histórico."
}
```

---

## 📌 Observações

- Todos os retornos seguem o padrão de `status` e `message`.
- Em caso de erro, será retornado `status: error` e uma mensagem descritiva.
- Datas utilizam o formato ISO 8601 (`YYYY-MM-DDTHH:MM:SS`).
- CPF deve ser validado conforme as regras brasileiras.

---

# ✨ Sobre o Projeto

Este sistema tem como objetivo facilitar o gerenciamento completo de um pet shop, desde o controle de estoque até o agendamento de serviços e relacionamento com clientes.

---
