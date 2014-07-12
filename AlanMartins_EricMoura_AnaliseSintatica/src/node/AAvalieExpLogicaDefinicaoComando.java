/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAvalieExpLogicaDefinicaoComando extends PDefinicaoComando
{
    private TAvalie _avalie_;
    private TLPar _lPar_;
    private PExpLogica _expLogica_;
    private TRPar _rPar_;
    private PMultiploCaso _multiploCaso_;
    private POpcionalSenaoCaso _opcionalSenaoCaso_;
    private TFimAvalie _fimAvalie_;
    private TPontoVirgula _pontoVirgula_;

    public AAvalieExpLogicaDefinicaoComando()
    {
        // Constructor
    }

    public AAvalieExpLogicaDefinicaoComando(
        @SuppressWarnings("hiding") TAvalie _avalie_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PMultiploCaso _multiploCaso_,
        @SuppressWarnings("hiding") POpcionalSenaoCaso _opcionalSenaoCaso_,
        @SuppressWarnings("hiding") TFimAvalie _fimAvalie_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setAvalie(_avalie_);

        setLPar(_lPar_);

        setExpLogica(_expLogica_);

        setRPar(_rPar_);

        setMultiploCaso(_multiploCaso_);

        setOpcionalSenaoCaso(_opcionalSenaoCaso_);

        setFimAvalie(_fimAvalie_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AAvalieExpLogicaDefinicaoComando(
            cloneNode(this._avalie_),
            cloneNode(this._lPar_),
            cloneNode(this._expLogica_),
            cloneNode(this._rPar_),
            cloneNode(this._multiploCaso_),
            cloneNode(this._opcionalSenaoCaso_),
            cloneNode(this._fimAvalie_),
            cloneNode(this._pontoVirgula_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAvalieExpLogicaDefinicaoComando(this);
    }

    public TAvalie getAvalie()
    {
        return this._avalie_;
    }

    public void setAvalie(TAvalie node)
    {
        if(this._avalie_ != null)
        {
            this._avalie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._avalie_ = node;
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

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
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

    public PMultiploCaso getMultiploCaso()
    {
        return this._multiploCaso_;
    }

    public void setMultiploCaso(PMultiploCaso node)
    {
        if(this._multiploCaso_ != null)
        {
            this._multiploCaso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multiploCaso_ = node;
    }

    public POpcionalSenaoCaso getOpcionalSenaoCaso()
    {
        return this._opcionalSenaoCaso_;
    }

    public void setOpcionalSenaoCaso(POpcionalSenaoCaso node)
    {
        if(this._opcionalSenaoCaso_ != null)
        {
            this._opcionalSenaoCaso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opcionalSenaoCaso_ = node;
    }

    public TFimAvalie getFimAvalie()
    {
        return this._fimAvalie_;
    }

    public void setFimAvalie(TFimAvalie node)
    {
        if(this._fimAvalie_ != null)
        {
            this._fimAvalie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimAvalie_ = node;
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
            + toString(this._avalie_)
            + toString(this._lPar_)
            + toString(this._expLogica_)
            + toString(this._rPar_)
            + toString(this._multiploCaso_)
            + toString(this._opcionalSenaoCaso_)
            + toString(this._fimAvalie_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._avalie_ == child)
        {
            this._avalie_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._multiploCaso_ == child)
        {
            this._multiploCaso_ = null;
            return;
        }

        if(this._opcionalSenaoCaso_ == child)
        {
            this._opcionalSenaoCaso_ = null;
            return;
        }

        if(this._fimAvalie_ == child)
        {
            this._fimAvalie_ = null;
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
        if(this._avalie_ == oldChild)
        {
            setAvalie((TAvalie) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._multiploCaso_ == oldChild)
        {
            setMultiploCaso((PMultiploCaso) newChild);
            return;
        }

        if(this._opcionalSenaoCaso_ == oldChild)
        {
            setOpcionalSenaoCaso((POpcionalSenaoCaso) newChild);
            return;
        }

        if(this._fimAvalie_ == oldChild)
        {
            setFimAvalie((TFimAvalie) newChild);
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