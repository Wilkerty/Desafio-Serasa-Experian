package adapter.repository.model;

import domain.Vendedor;

public class VendedorModelMapper {


    public static Vendedor modelToEntity(VendedorModel model){
        if (model == null)
            return null;
        return new Vendedor(model.getId(), model.getData_inclusao(), model.getNome(), model.getTelefone(), model.getIdade(),
                            model.getCidade(), model.getEstado(), model.getRegiao() );


    }


}
