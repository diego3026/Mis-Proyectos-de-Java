/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.List;

/**
 *
 * @author asus
 */
public class MultiLista<E,V> implements List<E>{
    Nodo<E,V> ptr = null;
    int num = 0;

    @Override
    public int size() {
        return num;
    }

    @Override
    public boolean isEmpty() {
        return (ptr==null);
    }
    
    public void addLower(E x) {
        if(!isEmpty()){
            NodoSub<E> nuevo=new NodoSub<>(x);
            Nodo<E,V> p=ptr;
            while(p!=null){
                NodoSub *c=p->inf;
                if(p->datoP.nombre==x){
                    if(p->inf==NULL){
                        p->inf=nuevo;
                    }else{
                        while(c->sig!=NULL){			
                            c=c->sig;
                        }
                        c->sig=nuevo;
                    }
                    return;
                }else{
                    p=p->sig;
                }
            }
	}
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
