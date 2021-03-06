/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADeclEscrevaDefinicaoComando extends PDefinicaoComando
{
    private TEscreva _escreva_;
    private TLPar _lPar_;
    private PMultiplaExp _multiplaExp_;
    private PExp _exp_;
    private TRPar _rPar_;
    private TPontoVirgula _pontoVirgula_;

    public ADeclEscrevaDefinicaoComando()
    {
        // Constructor
    }

    public ADeclEscrevaDefinicaoComando(
        @SuppressWarnings("hiding") TEscreva _escreva_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PMultiplaExp _multiplaExp_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setEscreva(_escreva_);

        setLPar(_lPar_);

        setMultiplaExp(_multiplaExp_);

        setExp(_exp_);

        setRPar(_rPar_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ADeclEscrevaDefinicaoComando(
            cloneNode(this._escreva_),
            cloneNode(this._lPar_),
            cloneNode(this._multiplaExp_),
            cloneNode(this._exp_),
            cloneNode(this._rPar_),
            cloneNode(this._pontoVirgula_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclEscrevaDefinicaoComando(this);
    }

    public TEscreva getEscreva()
    {
        return this._escreva_;
    }

    public void setEscreva(TEscreva node)
    {
        if(this._escreva_ != null)
        {
            this._escreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escreva_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PMultiplaExp getMultiplaExp()
    {
        return this._multiplaExp_;
    }

    public void setMultiplaExp(PMultiplaExp node)
    {
        if(this._multiplaExp_ != null)
        {
            this._multiplaExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiplaExp_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._escreva_)
            + toString(this._lPar_)
            + toString(this._multiplaExp_)
            + toString(this._exp_)
            + toString(this._rPar_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escreva_ == child)
        {
            this._escreva_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._multiplaExp_ == child)
        {
            this._multiplaExp_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._escreva_ == oldChild)
        {
            setEscreva((TEscreva) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._multiplaExp_ == oldChild)
        {
            setMultiplaExp((PMultiplaExp) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
