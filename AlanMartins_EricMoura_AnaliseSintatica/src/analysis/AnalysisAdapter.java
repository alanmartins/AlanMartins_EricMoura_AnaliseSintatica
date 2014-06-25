/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    public void caseAUnicoDeclaracao(AUnicoDeclaracao node)
    {
        defaultCase(node);
    }

    public void caseAMultiploDeclaracao(AMultiploDeclaracao node)
    {
        defaultCase(node);
    }

    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        defaultCase(node);
    }

    public void caseAVariavelDefinicao(AVariavelDefinicao node)
    {
        defaultCase(node);
    }

    public void caseAUnicoIdentificador(AUnicoIdentificador node)
    {
        defaultCase(node);
    }

    public void caseAMultiploIdentificador(AMultiploIdentificador node)
    {
        defaultCase(node);
    }

    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    public void caseAInteiroValor(AInteiroValor node)
    {
        defaultCase(node);
    }

    public void caseARealValor(ARealValor node)
    {
        defaultCase(node);
    }

    public void caseATipoRealTipo(ATipoRealTipo node)
    {
        defaultCase(node);
    }

    public void caseATipoIntTipo(ATipoIntTipo node)
    {
        defaultCase(node);
    }

    public void caseATipoCaractereTipo(ATipoCaractereTipo node)
    {
        defaultCase(node);
    }

    public void caseAMultiIdentificador(AMultiIdentificador node)
    {
        defaultCase(node);
    }

    public void caseAMultiploId(AMultiploId node)
    {
        defaultCase(node);
    }

    public void caseAUnicoComando(AUnicoComando node)
    {
        defaultCase(node);
    }

    public void caseAMultiploComando(AMultiploComando node)
    {
        defaultCase(node);
    }

    public void caseADeclAtribuicaoDefinicaoComando(ADeclAtribuicaoDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclLeiaDefinicaoComando(ADeclLeiaDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclEscrevaDefinicaoComando(ADeclEscrevaDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclAvalieDefinicaoComando(ADeclAvalieDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclEnquantoCmdDefinicaoComando(ADeclEnquantoCmdDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclEnquantoDefinicaoComando(ADeclEnquantoDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclRepitaCmdDefinicaoComando(ADeclRepitaCmdDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclRepitaDefinicaoComando(ADeclRepitaDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclParaAteCmdDefinicaoComando(ADeclParaAteCmdDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclParaAteDefinicaoComando(ADeclParaAteDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclParaPassoCmdDefinicaoComando(ADeclParaPassoCmdDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclParaPassoDefinicaoComando(ADeclParaPassoDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclSeCmdDefinicaoComando(ADeclSeCmdDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseADeclSeDefinicaoComando(ADeclSeDefinicaoComando node)
    {
        defaultCase(node);
    }

    public void caseAOpcionalSenaoSe(AOpcionalSenaoSe node)
    {
        defaultCase(node);
    }

    public void caseASenaoCmdSenaoSe(ASenaoCmdSenaoSe node)
    {
        defaultCase(node);
    }

    public void caseASenaoSenaoSe(ASenaoSenaoSe node)
    {
        defaultCase(node);
    }

    public void caseAOpcionalSenaoCaso(AOpcionalSenaoCaso node)
    {
        defaultCase(node);
    }

    public void caseACasoCmdSenaoCaso(ACasoCmdSenaoCaso node)
    {
        defaultCase(node);
    }

    public void caseACasoSenaoCaso(ACasoSenaoCaso node)
    {
        defaultCase(node);
    }

    public void caseAMultiploCaso(AMultiploCaso node)
    {
        defaultCase(node);
    }

    public void caseADefCasoCmdDefinicaoCaso(ADefCasoCmdDefinicaoCaso node)
    {
        defaultCase(node);
    }

    public void caseADefCasoDefinicaoCaso(ADefCasoDefinicaoCaso node)
    {
        defaultCase(node);
    }

    public void caseAMultiExp(AMultiExp node)
    {
        defaultCase(node);
    }

    public void caseAMultiplaExp(AMultiplaExp node)
    {
        defaultCase(node);
    }

    public void caseATermoExp(ATermoExp node)
    {
        defaultCase(node);
    }

    public void caseAMaisExp(AMaisExp node)
    {
        defaultCase(node);
    }

    public void caseAMenosExp(AMenosExp node)
    {
        defaultCase(node);
    }

    public void caseAFatorTermo(AFatorTermo node)
    {
        defaultCase(node);
    }

    public void caseAMultiplicacaoTermo(AMultiplicacaoTermo node)
    {
        defaultCase(node);
    }

    public void caseADivisaoTermo(ADivisaoTermo node)
    {
        defaultCase(node);
    }

    public void caseAMenosUnarioUnario(AMenosUnarioUnario node)
    {
        defaultCase(node);
    }

    public void caseAFatorUnario(AFatorUnario node)
    {
        defaultCase(node);
    }

    public void caseAIdentificadorFator(AIdentificadorFator node)
    {
        defaultCase(node);
    }

    public void caseAValorFator(AValorFator node)
    {
        defaultCase(node);
    }

    public void caseAExpFator(AExpFator node)
    {
        defaultCase(node);
    }

    public void caseAExpressaoFator(AExpressaoFator node)
    {
        defaultCase(node);
    }

    public void caseAExpOuExpLogica(AExpOuExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAItemOuExpLogica(AItemOuExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAExpXouItem(AExpXouItem node)
    {
        defaultCase(node);
    }

    public void caseAItemXouItem(AItemXouItem node)
    {
        defaultCase(node);
    }

    public void caseAExpELogTermo(AExpELogTermo node)
    {
        defaultCase(node);
    }

    public void caseATemELogTermo(ATemELogTermo node)
    {
        defaultCase(node);
    }

    public void caseARelacionalLogFator(ARelacionalLogFator node)
    {
        defaultCase(node);
    }

    public void caseANegacaoLogFator(ANegacaoLogFator node)
    {
        defaultCase(node);
    }

    public void caseAIgualRelacional(AIgualRelacional node)
    {
        defaultCase(node);
    }

    public void caseADiferenteRelacional(ADiferenteRelacional node)
    {
        defaultCase(node);
    }

    public void caseAMenorRelacional(AMenorRelacional node)
    {
        defaultCase(node);
    }

    public void caseAMaiorRelacional(AMaiorRelacional node)
    {
        defaultCase(node);
    }

    public void caseAMenorIgualRelacional(AMenorIgualRelacional node)
    {
        defaultCase(node);
    }

    public void caseAMaiorIgualRelacional(AMaiorIgualRelacional node)
    {
        defaultCase(node);
    }

    public void caseTNumInteiro(TNumInteiro node)
    {
        defaultCase(node);
    }

    public void caseTNumReal(TNumReal node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    public void caseTAspasSimples(TAspasSimples node)
    {
        defaultCase(node);
    }

    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTLColc(TLColc node)
    {
        defaultCase(node);
    }

    public void caseTRColc(TRColc node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    public void caseTIgualLog(TIgualLog node)
    {
        defaultCase(node);
    }

    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    public void caseTXou(TXou node)
    {
        defaultCase(node);
    }

    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    public void caseTVariavel(TVariavel node)
    {
        defaultCase(node);
    }

    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    public void caseTBranco(TBranco node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
