package adapter.repository.model;

import domain.Atuacao;

public class VendedorAtuacaoModelMapper {

    public static Atuacao modelToEnttity(VendedorAtuacaoModel model){
        if (model == null)
            return null;
        return new Atuacao(model.getRegiao(), model.getEstados());
    }

}
