/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ADeclParaAteDefinicaoComando extends PDefinicaoComando
{
    private TPara _para_;
    private PIdentificador _identificador_;
    private TDe _de_;
    private TNumInteiro _numInteiro_;
    private TAte _ate_;
    private TNumInteiro _int_;
    private TFaca _faca_;
    private PComando _comando_;
    private TFimPara _fimPara_;
    private TPontoVirgula _pontoVirgula_;

    public ADeclParaAteDefinicaoComando()
    {
        // Constructor
    }

    public ADeclParaAteDefinicaoComando(
        @SuppressWarnings("hiding") TPara _para_,
        @SuppressWarnings("hiding") PIdentificador _identificador_,
        @SuppressWarnings("hiding") TDe _de_,
        @SuppressWarnings("hiding") TNumInteiro _numInteiro_,
        @SuppressWarnings("hiding") TAte _ate_,
        @SuppressWarnings("hiding") TNumInteiro _int_,
        @SuppressWarnings("hiding") TFaca _faca_,
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TFimPara _fimPara_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setPara(_para_);

        setIdentificador(_identificador_);

        setDe(_de_);

        setNumInteiro(_numInteiro_);

        setAte(_ate_);

        setInt(_int_);

        setFaca(_faca_);

        setComando(_comando_);

        setFimPara(_fimPara_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ADeclParaAteDefinicaoComando(
            cloneNode(this._para_),
            cloneNode(this._identificador_),
            cloneNode(this._de_),
            cloneNode(this._numInteiro_),
            cloneNode(this._ate_),
            cloneNode(this._int_),
            cloneNode(this._faca_),
            cloneNode(this._comando_),
            cloneNode(this._fimPara_),
            cloneNode(this._pontoVirgula_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclParaAteDefinicaoComando(this);
    }

    public TPara getPara()
    {
        return this._para_;
    }

    public void setPara(TPara node)
    {
        if(this._para_ != null)
        {
            this._para_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._para_ = node;
    }

    public PIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(PIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public TDe getDe()
    {
        return this._de_;
    }

    public void setDe(TDe node)
    {
        if(this._de_ != null)
        {
            this._de_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._de_ = node;
    }

    public TNumInteiro getNumInteiro()
    {
        return this._numInteiro_;
    }

    public void setNumInteiro(TNumInteiro node)
    {
        if(this._numInteiro_ != null)
        {
            this._numInteiro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numInteiro_ = node;
    }

    public TAte getAte()
    {
        return this._ate_;
    }

    public void setAte(TAte node)
    {
        if(this._ate_ != null)
        {
            this._ate_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ate_ = node;
    }

    public TNumInteiro getInt()
    {
        return this._int_;
    }

    public void setInt(TNumInteiro node)
    {
        if(this._int_ != null)
        {
            this._int_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._int_ = node;
    }

    public TFaca getFaca()
    {
        return this._faca_;
    }

    public void setFaca(TFaca node)
    {
        if(this._faca_ != null)
        {
            this._faca_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._faca_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    public TFimPara getFimPara()
    {
        return this._fimPara_;
    }

    public void setFimPara(TFimPara node)
    {
        if(this._fimPara_ != null)
        {
            this._fimPara_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimPara_ = node;
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
            + toString(this._para_)
            + toString(this._identificador_)
            + toString(this._de_)
            + toString(this._numInteiro_)
            + toString(this._ate_)
            + toString(this._int_)
            + toString(this._faca_)
            + toString(this._comando_)
            + toString(this._fimPara_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._para_ == child)
        {
            this._para_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._de_ == child)
        {
            this._de_ = null;
            return;
        }

        if(this._numInteiro_ == child)
        {
            this._numInteiro_ = null;
            return;
        }

        if(this._ate_ == child)
        {
            this._ate_ = null;
            return;
        }

        if(this._int_ == child)
        {
            this._int_ = null;
            return;
        }

        if(this._faca_ == child)
        {
            this._faca_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        if(this._fimPara_ == child)
        {
            this._fimPara_ = null;
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
        if(this._para_ == oldChild)
        {
            setPara((TPara) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((PIdentificador) newChild);
            return;
        }

        if(this._de_ == oldChild)
        {
            setDe((TDe) newChild);
            return;
        }

        if(this._numInteiro_ == oldChild)
        {
            setNumInteiro((TNumInteiro) newChild);
            return;
        }

        if(this._ate_ == oldChild)
        {
            setAte((TAte) newChild);
            return;
        }

        if(this._int_ == oldChild)
        {
            setInt((TNumInteiro) newChild);
            return;
        }

        if(this._faca_ == oldChild)
        {
            setFaca((TFaca) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        if(this._fimPara_ == oldChild)
        {
            setFimPara((TFimPara) newChild);
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