public class Main {

    Violao violao = new Violao.ViolaoBuilder()
            .preco(152)
            .cor("laranja")
            .tipoCorda("aco")
            .tamanhoBraco("50 cm")
            .tipoTarraxa("1")
            .materialCorpo("madeira")
            .criarViolao();
}
