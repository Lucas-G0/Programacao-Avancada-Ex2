package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoRepo {
    public List<Produto> produtoList = new ArrayList<>();

    public void Add(Produto produto)
    {
        produtoList.add(produto);
    }

    public Produto GetByCodigo(int codigo)
    {
        for (Produto produto : produtoList) {
            if (produto.codigo == codigo)
                return produto;
        }
        return null;
    }
}
