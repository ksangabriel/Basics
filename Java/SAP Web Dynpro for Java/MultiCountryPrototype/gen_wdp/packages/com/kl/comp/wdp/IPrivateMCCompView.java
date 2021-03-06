// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator.
// DO NOT MODIFY! CHANGES WILL BE LOST IF THE FILE IS REGENERATED.
// ---------------------------------------------------------------------------
package com.kl.comp.wdp;

import com.sap.tc.webdynpro.progmodel.api.*;
import com.sap.tc.webdynpro.progmodel.gci.*;
import com.sap.tc.webdynpro.progmodel.context.*;
import com.sap.tc.webdynpro.services.exceptions.WDRuntimeException;

/** Interface that is provided to application class. */

public interface IPrivateMCCompView {

  /*
   * Event Handler identifiers.
   */ 
    
  /** Event handler constant. */
  public static IWDEventHandlerId WD_EVENTHANDLER_ON_ACTIONREMOVE_ITEM = new com.sap.tc.webdynpro.progmodel.gci.impl.GCIEventHandlerId("onActionremoveItem", "MCCompView", "com.kl.comp.MCComp");
  
  /** Event handler constant. */
  public static IWDEventHandlerId WD_EVENTHANDLER_ON_ACTIONUPDATE = new com.sap.tc.webdynpro.progmodel.gci.impl.GCIEventHandlerId("onActionupdate", "MCCompView", "com.kl.comp.MCComp");
  
  /** Event handler constant. */
  public static IWDEventHandlerId WD_EVENTHANDLER_ON_ACTIONADD = new com.sap.tc.webdynpro.progmodel.gci.impl.GCIEventHandlerId("onActionadd", "MCCompView", "com.kl.comp.MCComp");
  
  /**
   * Provides access to the generic API of this controller.
   */
  IWDViewController wdGetAPI();


  /**
   * Interface for the node 'Context'.
   *
   * singleton = true, cardinality = _1_1, selection = _1_1
   */
  public static class IContextNode extends Node
  {
    private InternalMCCompView gen_delegate;

    IContextNode(InternalMCCompView delegate, IGCINodeInfo nodeInfo, Node parent) {
      super(nodeInfo, parent);
      gen_delegate = delegate;
    }

    protected com.sap.tc.webdynpro.progmodel.context.Node createNode(IGCINodeInfo nodeInfo, com.sap.tc.webdynpro.progmodel.context.Node parentNode, com.sap.tc.webdynpro.progmodel.context.NodeElement parentElement) {
      if (nodeInfo == gen_delegate.infoContext)
        return new IPrivateMCCompView.IContextNode(gen_delegate, nodeInfo, parentNode);
      if (nodeInfo == gen_delegate.infoAclUser)
        return new IPrivateMCCompView.IAclUserNode(gen_delegate, nodeInfo, parentNode);
      if (nodeInfo == gen_delegate.infoAvailableCountriesList)
        return new IPrivateMCCompView.IAvailableCountriesListNode(gen_delegate, nodeInfo, parentNode);
      if (nodeInfo == gen_delegate.infoAclUserCountriesList)
        return new IPrivateMCCompView.IAclUserCountriesListNode(gen_delegate, nodeInfo, parentNode);
      if (nodeInfo == gen_delegate.infoAclUserTemp)
        return new IPrivateMCCompView.IAclUserTempNode(gen_delegate, nodeInfo, parentNode);
      return super.createNode(nodeInfo, parentNode, parentElement);
    }

    protected com.sap.tc.webdynpro.progmodel.context.NodeElement doCreateElement(IGCINodeInfo nodeInfo, Object reference) {
      if (nodeInfo == gen_delegate.infoContext) {
        return new IPrivateMCCompView.IContextElement(gen_delegate, nodeInfo);
      }
      if (nodeInfo == gen_delegate.infoAclUser) {
        return new IPrivateMCCompView.IAclUserElement(gen_delegate, nodeInfo, reference);
      }
      if (nodeInfo == gen_delegate.infoAvailableCountriesList) {
        return new IPrivateMCCompView.IAvailableCountriesListElement(gen_delegate, nodeInfo, reference);
      }
      if (nodeInfo == gen_delegate.infoAclUserCountriesList) {
        return new IPrivateMCCompView.IAclUserCountriesListElement(gen_delegate, nodeInfo, reference);
      }
      if (nodeInfo == gen_delegate.infoAclUserTemp) {
        return new IPrivateMCCompView.IAclUserTempElement(gen_delegate, nodeInfo);
      }
      return super.doCreateElement(nodeInfo, reference);
    }

    // ---- typed accessors --------------------------------------------------

    /**
     * Provides access to the generic context API as described by IWDContext.
     */
    public IWDContext wdGetAPI() {
      return getContext();
    }

    /**
     * Creates a new element for this node. The element is <b>not</b> bound 
     * to the node. Use {@link #bind(IContextElement)} or 
     * {@link IWDNode#bind(Collection)} to bind it or {@link IWDNode#addElement(IWDNodeElement)}
     * to add it to the node.
     * @return an element for this node
     */
    public IPrivateMCCompView.IContextElement createContextElement() {
      return (IPrivateMCCompView.IContextElement)createElement();
    }

    /**
     * Binds a single IContextElement to the node.
     * @param element a node element for this node
     */
    public void bind(IPrivateMCCompView.IContextElement element) {
      bind(element == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(element));
    }

    /** 
     * Returns the element at the lead selection.
     * @return the element at the lead selection or <code>null</code> if the
     *         lead selection is not set
     */
    public IPrivateMCCompView.IContextElement currentContextElement() {
      return (IPrivateMCCompView.IContextElement) getCurrentElement();
    }

    // ---- hooks ------------------------------------------------------------

    // ---- child nodes ------------------------------------------------------------

    private IPrivateMCCompView.IAclUserNode gen_nodeAclUser;
    
    /**
     * Returns the singleton child node AclUser.
     * @return the child node
     */
    public IPrivateMCCompView.IAclUserNode nodeAclUser() {
      if (gen_nodeAclUser == null)
        gen_nodeAclUser = (IPrivateMCCompView.IAclUserNode) getChildNode("AclUser");
      return gen_nodeAclUser;
    }

    /**
     * Returns the current (lead selection) element of the singleton child node
     * AclUser.
     * @return the child node element or <code>null</code> if no such element 
     *         exists
     */
    public IPrivateMCCompView.IAclUserElement currentAclUserElement() {
      return (IPrivateMCCompView.IAclUserElement) nodeAclUser().getCurrentElement();
    }

    public IPrivateMCCompView.IAclUserElement createAclUserElement(com.kl.bean.CountryDao model) {
      return (IPrivateMCCompView.IAclUserElement) doCreateElement(gen_delegate.infoAclUser, model);
    }

    /**
     * Returns the descendant node AvailableCountriesList that is on the lead selection path.
     * @return the descendant node
     */
    public IPrivateMCCompView.IAvailableCountriesListNode nodeAvailableCountriesList() {
      IPrivateMCCompView.IAclUserNode node = nodeAclUser();
      return (IPrivateMCCompView.IAvailableCountriesListNode)(node != null ? node.getChildNode("AvailableCountriesList", LEAD_SELECTION) : null);
    }

    /**
     * Returns the current (lead selection) element of the descendant node AvailableCountriesList 
     * following the lead selection path to that node.
     * @return the lead selection element of the descendant node 
     */
    public IPrivateMCCompView.IAvailableCountriesListElement currentAvailableCountriesListElement() {
      IPrivateMCCompView.IAvailableCountriesListNode node = nodeAvailableCountriesList();
      return (IPrivateMCCompView.IAvailableCountriesListElement)(node != null ? node.getCurrentElement() : null);
    }

    /**
     * Creates a new, unbound element for the descendant node AvailableCountriesList. 
     * @return the newly created element 
     */
    public IPrivateMCCompView.IAvailableCountriesListElement createAvailableCountriesListElement(com.kl.bean.CountryBean model) {
      return (IPrivateMCCompView.IAvailableCountriesListElement) nodeAvailableCountriesList().createElement(model);
    }

    /**
     * Returns the descendant node AclUserCountriesList that is on the lead selection path.
     * @return the descendant node
     */
    public IPrivateMCCompView.IAclUserCountriesListNode nodeAclUserCountriesList() {
      IPrivateMCCompView.IAclUserNode node = nodeAclUser();
      return (IPrivateMCCompView.IAclUserCountriesListNode)(node != null ? node.getChildNode("AclUserCountriesList", LEAD_SELECTION) : null);
    }

    /**
     * Returns the current (lead selection) element of the descendant node AclUserCountriesList 
     * following the lead selection path to that node.
     * @return the lead selection element of the descendant node 
     */
    public IPrivateMCCompView.IAclUserCountriesListElement currentAclUserCountriesListElement() {
      IPrivateMCCompView.IAclUserCountriesListNode node = nodeAclUserCountriesList();
      return (IPrivateMCCompView.IAclUserCountriesListElement)(node != null ? node.getCurrentElement() : null);
    }

    /**
     * Creates a new, unbound element for the descendant node AclUserCountriesList. 
     * @return the newly created element 
     */
    public IPrivateMCCompView.IAclUserCountriesListElement createAclUserCountriesListElement(com.kl.bean.CountryBean model) {
      return (IPrivateMCCompView.IAclUserCountriesListElement) nodeAclUserCountriesList().createElement(model);
    }

    private IPrivateMCCompView.IAclUserTempNode gen_nodeAclUserTemp;
    
    /**
     * Returns the singleton child node AclUserTemp.
     * @return the child node
     */
    public IPrivateMCCompView.IAclUserTempNode nodeAclUserTemp() {
      if (gen_nodeAclUserTemp == null)
        gen_nodeAclUserTemp = (IPrivateMCCompView.IAclUserTempNode) getChildNode("AclUserTemp");
      return gen_nodeAclUserTemp;
    }

    /**
     * Returns the current (lead selection) element of the singleton child node
     * AclUserTemp.
     * @return the child node element or <code>null</code> if no such element 
     *         exists
     */
    public IPrivateMCCompView.IAclUserTempElement currentAclUserTempElement() {
      return (IPrivateMCCompView.IAclUserTempElement) nodeAclUserTemp().getCurrentElement();
    }

    public IPrivateMCCompView.IAclUserTempElement createAclUserTempElement() {
      return (IPrivateMCCompView.IAclUserTempElement) doCreateElement(gen_delegate.infoAclUserTemp, null);
    }

  }

  /**
   * Interface for the elements of the node Context.
   */
  public static class IContextElement extends com.sap.tc.webdynpro.progmodel.context.NodeElement
  {
    private InternalMCCompView gen_delegate;

    public IContextElement(InternalMCCompView delegate, com.sap.tc.webdynpro.progmodel.gci.IGCINodeInfo info) {
      super(info);
      gen_delegate = delegate;
    }

  }


  /**
   * Interface for the node 'AclUser'.
   *
   * singleton = true, cardinality = _0_n, selection = _0_1
   */
  public static class IAclUserNode extends Node
  {
    private InternalMCCompView gen_delegate;

    IAclUserNode(InternalMCCompView delegate, IGCINodeInfo nodeInfo, Node parent) {
      super(nodeInfo, parent);
      gen_delegate = delegate;
    }

    // ---- typed accessors --------------------------------------------------

    /**
     * Creates a new element for this node. The element is <b>not</b> bound 
     * to the node. Use {@link #bind(IAclUserElement)} or 
     * {@link IWDNode#bind(Collection)} to bind it or {@link IWDNode#addElement(IWDNodeElement)}
     * to add it to the node.
     * @param model an instance of com.kl.bean.CountryDao needed for this model element
     * @return an element for this node
     */
    public IPrivateMCCompView.IAclUserElement createAclUserElement(com.kl.bean.CountryDao model) {
      return (IPrivateMCCompView.IAclUserElement)createElement(model);
    }

    /**
     * Binds a single IAclUserElement to the node.
     * @param element a node element for this node
     */
    public void bind(IPrivateMCCompView.IAclUserElement element) {
      bind(element == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(element));
    }

    /**
     * Creates a new IAclUserElement with the given model object 
     * and binds it to this node.
     * @param model an object of the model class
     */
    public void bind(com.kl.bean.CountryDao model) {
      bind(model == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(model));
    }

    /** 
     * Returns the element at the lead selection.
     * @return the element at the lead selection or <code>null</code> if the
     *         lead selection is not set
     */
    public IPrivateMCCompView.IAclUserElement currentAclUserElement() {
      return (IPrivateMCCompView.IAclUserElement) getCurrentElement();
    }

    /** 
     * Returns the element at the given index.
     * @param index the index of the element you want to get
     * @return the element or <code>null</code> if no element
     *         exists at that index
     */
    public IPrivateMCCompView.IAclUserElement getAclUserElementAt(int index) {
      return (IPrivateMCCompView.IAclUserElement) getElementAt(index);
    }

    // ---- hooks ------------------------------------------------------------

    // ---- child nodes ------------------------------------------------------------

    private IPrivateMCCompView.IAvailableCountriesListNode gen_nodeAvailableCountriesList;
    
    /**
     * Returns the singleton child node AvailableCountriesList.
     * @return the child node
     */
    public IPrivateMCCompView.IAvailableCountriesListNode nodeAvailableCountriesList() {
      if (gen_nodeAvailableCountriesList == null)
        gen_nodeAvailableCountriesList = (IPrivateMCCompView.IAvailableCountriesListNode) getChildNode("AvailableCountriesList");
      return gen_nodeAvailableCountriesList;
    }

    private IPrivateMCCompView.IAclUserCountriesListNode gen_nodeAclUserCountriesList;
    
    /**
     * Returns the singleton child node AclUserCountriesList.
     * @return the child node
     */
    public IPrivateMCCompView.IAclUserCountriesListNode nodeAclUserCountriesList() {
      if (gen_nodeAclUserCountriesList == null)
        gen_nodeAclUserCountriesList = (IPrivateMCCompView.IAclUserCountriesListNode) getChildNode("AclUserCountriesList");
      return gen_nodeAclUserCountriesList;
    }

  }

  /**
   * Interface for the elements of the node AclUser.
   */
  public static class IAclUserElement extends com.sap.tc.webdynpro.progmodel.context.MappedNodeElement
  {
    private InternalMCCompView gen_delegate;

    public IAclUserElement(InternalMCCompView delegate, com.sap.tc.webdynpro.progmodel.gci.IGCINodeInfo info, Object reference) {
      super(info, reference);
      gen_delegate = delegate;
    }

    /**
     * Returns the referenced element of the mapped node.
     * @return the referenced element
     */
    public com.kl.comp.wdp.IPublicMCComp.IAclUserElement mappedAclUserElement() {
      return (com.kl.comp.wdp.IPublicMCComp.IAclUserElement)wdGetMappedElement();
    }

    /**
     * Returns the referenced com.kl.bean.CountryDao.
     * @return the referenced com.kl.bean.CountryDao
     */
    public com.kl.bean.CountryDao modelObject() {
      return (com.kl.bean.CountryDao)model();
    }
    
  }


  /**
   * Interface for the node 'AvailableCountriesList'.
   *
   * singleton = true, cardinality = _0_n, selection = _0_1
   */
  public static class IAvailableCountriesListNode extends Node
  {
    private InternalMCCompView gen_delegate;

    IAvailableCountriesListNode(InternalMCCompView delegate, IGCINodeInfo nodeInfo, Node parent) {
      super(nodeInfo, parent);
      gen_delegate = delegate;
    }

    // ---- typed accessors --------------------------------------------------

    /**
     * Creates a new element for this node. The element is <b>not</b> bound 
     * to the node. Use {@link #bind(IAvailableCountriesListElement)} or 
     * {@link IWDNode#bind(Collection)} to bind it or {@link IWDNode#addElement(IWDNodeElement)}
     * to add it to the node.
     * @param model an instance of com.kl.bean.CountryBean needed for this model element
     * @return an element for this node
     */
    public IPrivateMCCompView.IAvailableCountriesListElement createAvailableCountriesListElement(com.kl.bean.CountryBean model) {
      return (IPrivateMCCompView.IAvailableCountriesListElement)createElement(model);
    }

    /**
     * Binds a single IAvailableCountriesListElement to the node.
     * @param element a node element for this node
     */
    public void bind(IPrivateMCCompView.IAvailableCountriesListElement element) {
      bind(element == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(element));
    }

    /**
     * Creates a new IAvailableCountriesListElement with the given model object 
     * and binds it to this node.
     * @param model an object of the model class
     */
    public void bind(com.kl.bean.CountryBean model) {
      bind(model == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(model));
    }

    /** 
     * Returns the element at the lead selection.
     * @return the element at the lead selection or <code>null</code> if the
     *         lead selection is not set
     */
    public IPrivateMCCompView.IAvailableCountriesListElement currentAvailableCountriesListElement() {
      return (IPrivateMCCompView.IAvailableCountriesListElement) getCurrentElement();
    }

    /** 
     * Returns the element at the given index.
     * @param index the index of the element you want to get
     * @return the element or <code>null</code> if no element
     *         exists at that index
     */
    public IPrivateMCCompView.IAvailableCountriesListElement getAvailableCountriesListElementAt(int index) {
      return (IPrivateMCCompView.IAvailableCountriesListElement) getElementAt(index);
    }

    // ---- hooks ------------------------------------------------------------

    // ---- child nodes ------------------------------------------------------------

  }

  /**
   * Interface for the elements of the node AvailableCountriesList.
   */
  public static class IAvailableCountriesListElement extends com.sap.tc.webdynpro.progmodel.context.MappedNodeElement
  {
    private InternalMCCompView gen_delegate;

    public IAvailableCountriesListElement(InternalMCCompView delegate, com.sap.tc.webdynpro.progmodel.gci.IGCINodeInfo info, Object reference) {
      super(info, reference);
      gen_delegate = delegate;
    }

    /**
     * Returns the referenced element of the mapped node.
     * @return the referenced element
     */
    public com.kl.comp.wdp.IPublicMCComp.IAvailableCountriesListElement mappedAvailableCountriesListElement() {
      return (com.kl.comp.wdp.IPublicMCComp.IAvailableCountriesListElement)wdGetMappedElement();
    }

    /**
     * Returns the referenced com.kl.bean.CountryBean.
     * @return the referenced com.kl.bean.CountryBean
     */
    public com.kl.bean.CountryBean modelObject() {
      return (com.kl.bean.CountryBean)model();
    }
    
    // attribute "country"
    public final static String COUNTRY = "country";

    /**
     * Returns the attribute country.
     */
    public java.lang.String getCountry() {
      return wdGetString(wdGetNodeInfoGCI().getAttributeGCI(0));
    }

    /**
     * Sets the attribute country.
     * @param value the new value
     */
    public void setCountry(java.lang.String value) {
      wdSetString(wdGetNodeInfoGCI().getAttributeGCI(0), value);
    }
    
    // attribute "countryCode"
    public final static String COUNTRY_CODE = "countryCode";

    /**
     * Returns the attribute countryCode.
     */
    public java.lang.String getCountryCode() {
      return wdGetString(wdGetNodeInfoGCI().getAttributeGCI(1));
    }

    /**
     * Sets the attribute countryCode.
     * @param value the new value
     */
    public void setCountryCode(java.lang.String value) {
      wdSetString(wdGetNodeInfoGCI().getAttributeGCI(1), value);
    }
    
  }


  /**
   * Interface for the node 'AclUserCountriesList'.
   *
   * singleton = true, cardinality = _0_n, selection = _0_1
   */
  public static class IAclUserCountriesListNode extends Node
  {
    private InternalMCCompView gen_delegate;

    IAclUserCountriesListNode(InternalMCCompView delegate, IGCINodeInfo nodeInfo, Node parent) {
      super(nodeInfo, parent);
      gen_delegate = delegate;
    }

    // ---- typed accessors --------------------------------------------------

    /**
     * Creates a new element for this node. The element is <b>not</b> bound 
     * to the node. Use {@link #bind(IAclUserCountriesListElement)} or 
     * {@link IWDNode#bind(Collection)} to bind it or {@link IWDNode#addElement(IWDNodeElement)}
     * to add it to the node.
     * @param model an instance of com.kl.bean.CountryBean needed for this model element
     * @return an element for this node
     */
    public IPrivateMCCompView.IAclUserCountriesListElement createAclUserCountriesListElement(com.kl.bean.CountryBean model) {
      return (IPrivateMCCompView.IAclUserCountriesListElement)createElement(model);
    }

    /**
     * Binds a single IAclUserCountriesListElement to the node.
     * @param element a node element for this node
     */
    public void bind(IPrivateMCCompView.IAclUserCountriesListElement element) {
      bind(element == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(element));
    }

    /**
     * Creates a new IAclUserCountriesListElement with the given model object 
     * and binds it to this node.
     * @param model an object of the model class
     */
    public void bind(com.kl.bean.CountryBean model) {
      bind(model == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(model));
    }

    /** 
     * Returns the element at the lead selection.
     * @return the element at the lead selection or <code>null</code> if the
     *         lead selection is not set
     */
    public IPrivateMCCompView.IAclUserCountriesListElement currentAclUserCountriesListElement() {
      return (IPrivateMCCompView.IAclUserCountriesListElement) getCurrentElement();
    }

    /** 
     * Returns the element at the given index.
     * @param index the index of the element you want to get
     * @return the element or <code>null</code> if no element
     *         exists at that index
     */
    public IPrivateMCCompView.IAclUserCountriesListElement getAclUserCountriesListElementAt(int index) {
      return (IPrivateMCCompView.IAclUserCountriesListElement) getElementAt(index);
    }

    // ---- hooks ------------------------------------------------------------

    // ---- child nodes ------------------------------------------------------------

  }

  /**
   * Interface for the elements of the node AclUserCountriesList.
   */
  public static class IAclUserCountriesListElement extends com.sap.tc.webdynpro.progmodel.context.MappedNodeElement
  {
    private InternalMCCompView gen_delegate;

    public IAclUserCountriesListElement(InternalMCCompView delegate, com.sap.tc.webdynpro.progmodel.gci.IGCINodeInfo info, Object reference) {
      super(info, reference);
      gen_delegate = delegate;
    }

    /**
     * Returns the referenced element of the mapped node.
     * @return the referenced element
     */
    public com.kl.comp.wdp.IPublicMCComp.IAclUserCountriesListElement mappedAclUserCountriesListElement() {
      return (com.kl.comp.wdp.IPublicMCComp.IAclUserCountriesListElement)wdGetMappedElement();
    }

    /**
     * Returns the referenced com.kl.bean.CountryBean.
     * @return the referenced com.kl.bean.CountryBean
     */
    public com.kl.bean.CountryBean modelObject() {
      return (com.kl.bean.CountryBean)model();
    }
    
    // attribute "country"
    public final static String COUNTRY = "country";

    /**
     * Returns the attribute country.
     */
    public java.lang.String getCountry() {
      return wdGetString(wdGetNodeInfoGCI().getAttributeGCI(0));
    }

    /**
     * Sets the attribute country.
     * @param value the new value
     */
    public void setCountry(java.lang.String value) {
      wdSetString(wdGetNodeInfoGCI().getAttributeGCI(0), value);
    }
    
    // attribute "countryCode"
    public final static String COUNTRY_CODE = "countryCode";

    /**
     * Returns the attribute countryCode.
     */
    public java.lang.String getCountryCode() {
      return wdGetString(wdGetNodeInfoGCI().getAttributeGCI(1));
    }

    /**
     * Sets the attribute countryCode.
     * @param value the new value
     */
    public void setCountryCode(java.lang.String value) {
      wdSetString(wdGetNodeInfoGCI().getAttributeGCI(1), value);
    }
    
  }


  /**
   * Interface for the node 'AclUserTemp'.
   *
   * singleton = true, cardinality = _0_n, selection = _0_1
   */
  public static class IAclUserTempNode extends Node
  {
    private InternalMCCompView gen_delegate;

    IAclUserTempNode(InternalMCCompView delegate, IGCINodeInfo nodeInfo, Node parent) {
      super(nodeInfo, parent);
      gen_delegate = delegate;
    }

    // ---- typed accessors --------------------------------------------------

    /**
     * Creates a new element for this node. The element is <b>not</b> bound 
     * to the node. Use {@link #bind(IAclUserTempElement)} or 
     * {@link IWDNode#bind(Collection)} to bind it or {@link IWDNode#addElement(IWDNodeElement)}
     * to add it to the node.
     * @return an element for this node
     */
    public IPrivateMCCompView.IAclUserTempElement createAclUserTempElement() {
      return (IPrivateMCCompView.IAclUserTempElement)createElement();
    }

    /**
     * Binds a single IAclUserTempElement to the node.
     * @param element a node element for this node
     */
    public void bind(IPrivateMCCompView.IAclUserTempElement element) {
      bind(element == null ? java.util.Collections.EMPTY_LIST : java.util.Collections.singletonList(element));
    }

    /** 
     * Returns the element at the lead selection.
     * @return the element at the lead selection or <code>null</code> if the
     *         lead selection is not set
     */
    public IPrivateMCCompView.IAclUserTempElement currentAclUserTempElement() {
      return (IPrivateMCCompView.IAclUserTempElement) getCurrentElement();
    }

    /** 
     * Returns the element at the given index.
     * @param index the index of the element you want to get
     * @return the element or <code>null</code> if no element
     *         exists at that index
     */
    public IPrivateMCCompView.IAclUserTempElement getAclUserTempElementAt(int index) {
      return (IPrivateMCCompView.IAclUserTempElement) getElementAt(index);
    }

    // ---- hooks ------------------------------------------------------------

    // ---- child nodes ------------------------------------------------------------

  }

  /**
   * Interface for the elements of the node AclUserTemp.
   */
  public static class IAclUserTempElement extends com.sap.tc.webdynpro.progmodel.context.NodeElement
  {
    private InternalMCCompView gen_delegate;

    public IAclUserTempElement(InternalMCCompView delegate, com.sap.tc.webdynpro.progmodel.gci.IGCINodeInfo info) {
      super(info);
      gen_delegate = delegate;
    }

    // attribute "country"
    public final static String COUNTRY = "country";

    private java.lang.String _country;

    /**
     * Returns the attribute country.
     */
    public java.lang.String getCountry() {
      return _country;
    }

    /**
     * Sets the attribute country.
     * @param value the new value
     */
    public void setCountry(java.lang.String value) {
      this._country = value;
      changed(0);
    }
    
    // attribute "countryCode"
    public final static String COUNTRY_CODE = "countryCode";

    private java.lang.String _countryCode;

    /**
     * Returns the attribute countryCode.
     */
    public java.lang.String getCountryCode() {
      return _countryCode;
    }

    /**
     * Sets the attribute countryCode.
     * @param value the new value
     */
    public void setCountryCode(java.lang.String value) {
      this._countryCode = value;
      changed(1);
    }
    
    // generic access to fields (framework usage)
    protected Object wdGetObject(IGCIAttributeInfo info) {
      switch (info.getIndex()) {
        case 0: // country
          return _country;
        case 1: // countryCode
          return _countryCode;
        default:
          return super.wdGetObject(info);
      }
    }

    protected void wdSetObject(IGCIAttributeInfo info, Object value) {
      switch (info.getIndex()) {
        case 0: // country
          this._country = (String)value;
          changed(info);
          break;
        case 1: // countryCode
          this._countryCode = (String)value;
          changed(info);
          break;
        default:
          super.wdSetObject(info, value);
          break;
      }
    }

    protected String wdGetString(IGCIAttributeInfo info) {
      switch (info.getIndex()) {
        case 0: // country
          return _country;
        case 1: // countryCode
          return _countryCode;
        default:
          return super.wdGetString(info);
      }
    }

    protected void wdSetString(IGCIAttributeInfo info, String value) {
      switch (info.getIndex()) {
        case 0: // country
          this._country = (java.lang.String)value;
          changed(info);
          break;
        case 1: // countryCode
          this._countryCode = (java.lang.String)value;
          changed(info);
          break;
        default:
          super.wdSetString(info, value);
          break;
      }
    }

  }

  /**
   * Returns the context root node.
   * @return the context root node.
   */
  IContextNode wdGetContext();

  /** Declared event handler. */
  void onActionremoveItem(IWDCustomEvent wdEvent );

  /** Declared event handler. */
  void onActionupdate(IWDCustomEvent wdEvent );

  /** Declared event handler. */
  void onActionadd(IWDCustomEvent wdEvent );

  /** Gets controller belonging to the same component. */
  com.kl.comp.wdp.IPublicMCComp wdGetMCCompController();

  /** Gets action 'removeItem'. */
  IWDAction wdGetRemoveItemAction();

  /** Gets action 'update'. */
  IWDAction wdGetUpdateAction();

  /** Gets action 'add'. */
  IWDAction wdGetAddAction();

  /** Enumeration of all available action event handlers. */
  public final class WDActionEventHandler extends com.sap.tc.webdynpro.progmodel.gci.GCIActionEventHandlerEnum
  {
    public static final WDActionEventHandler REMOVE_ITEM = new WDActionEventHandler("onActionremoveItem", true, NO_PARAMETERS);
    public static final WDActionEventHandler UPDATE = new WDActionEventHandler("onActionupdate", true, NO_PARAMETERS);
    public static final WDActionEventHandler ADD = new WDActionEventHandler("onActionadd", true, NO_PARAMETERS);

    private WDActionEventHandler(String value, boolean isValidating, Object[] declaredParameters) {
      super(value, isValidating, declaredParameters);
    }
  }

  /**
   * Creates a new action for this controller.
   * @param eventHandler is the action's event handler with an appropriate signature
   * @param text is the text displayed in the UI element triggering this action
   */
  IWDAction wdCreateAction(WDActionEventHandler eventHandler, String text);

  /**
   * Creates a new action with the given name for this controller.
   * @param eventHandler is the action's event handler with an appropriate signature
   * @param name is the action's name
   * @param text is the text displayed in the UI element triggering this action
   */
  IWDAction wdCreateNamedAction(WDActionEventHandler eventHandler, String name, String text);

}
