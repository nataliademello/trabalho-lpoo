# trabalho-lpoo

## Classe de gerenciamento
Deseja-se gerenciar uma loja. A loja deve impossibilitar a inserção de produtos duplicados. A busca de produtos da loja é feita pelo identificador único do produto, bem como a remoção.

## Entidades gerenciadas e chave única
Os tipos de produtos disponíveis na loja são: importados, nacionais, e artesanais. Cada produto é diferenciado a partir de um identificador único, chamado _id_.

## Semelhanças
Queremos manter registros de nome, valor de venda, quantidade em estoque, valor de compra e imposto de cada produto. Algumas diferenças entre os tipos de produtos são:
 
## Diferenças
Os produtos importados possuem uma taxa de importação, enquanto produtos artesanais possuem uma comissão. Produtos nacionais são acrescidos do nome do fornecedor.
 
## Relatórios e seus critérios
Foram pensados 3 tipos de relatórios:
Geral: traz informações de todos os produtos da loja, ordenados pelo nome.
Filtrado por tipo de produto: traz informações dos tipos de produtos da loja mais vendidos, ordenando dos mais vendidos para menos vendidos.
Filtrado por lucro: traz informações dos produtos da loja cujo lucro é maior que o informado, ordenados do maior para o menor lucro.
 
## Comportamento específico
O lucro é calculado de forma diferente para cada tipo de produto, a depender dos custos envolvidos em cada um, tal como taxas de importação ou comissão.
