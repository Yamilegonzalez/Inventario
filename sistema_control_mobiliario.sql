--
-- PostgreSQL database dump
--

-- Dumped from database version 13.4
-- Dumped by pg_dump version 13.3

-- Started on 2021-09-13 18:31:14

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 201 (class 1259 OID 33025)
-- Name: area; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.area (
    id_area bigint NOT NULL,
    nombre_area text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.area OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 33023)
-- Name: area_id_area_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.area ALTER COLUMN id_area ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.area_id_area_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 209 (class 1259 OID 33083)
-- Name: categoria_item; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.categoria_item (
    id_categoria bigint NOT NULL,
    nombre_categoria text,
    descripcion text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.categoria_item OWNER TO postgres;

--
-- TOC entry 208 (class 1259 OID 33081)
-- Name: categoria_item_id_categoria_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.categoria_item ALTER COLUMN id_categoria ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.categoria_item_id_categoria_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 221 (class 1259 OID 33156)
-- Name: estatus_item; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estatus_item (
    id_estatus bigint NOT NULL,
    estado text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.estatus_item OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 33154)
-- Name: estatus_item_id_estatus_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.estatus_item ALTER COLUMN id_estatus ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.estatus_item_id_estatus_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 207 (class 1259 OID 33071)
-- Name: item; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.item (
    id_item bigint NOT NULL,
    id_categoria bigint,
    no_serie text,
    nombre_item text,
    descripcion text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.item OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 33069)
-- Name: item_id_item_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.item ALTER COLUMN id_item ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.item_id_item_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 217 (class 1259 OID 33131)
-- Name: reporte_usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.reporte_usuario (
    id_reporte_usuario bigint NOT NULL,
    id_usuario bigint,
    id_item bigint,
    id_solicitud bigint,
    motivo text,
    descripcion text,
    url_img text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.reporte_usuario OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 33129)
-- Name: reporte_usuario_id_reporte_usuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.reporte_usuario ALTER COLUMN id_reporte_usuario ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.reporte_usuario_id_reporte_usuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 213 (class 1259 OID 33107)
-- Name: rol; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.rol (
    id_rol bigint NOT NULL,
    nombre_rol text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.rol OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 33105)
-- Name: rol_id_rol_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.rol ALTER COLUMN id_rol ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.rol_id_rol_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 211 (class 1259 OID 33095)
-- Name: sancion_aplicada; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sancion_aplicada (
    id_sancion_usuario_apli bigint NOT NULL,
    id_sancion_usuario bigint,
    id_usuario bigint,
    id_item bigint,
    motivo_operador text,
    fecha_ingresada date,
    fecha_limite date,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.sancion_aplicada OWNER TO postgres;

--
-- TOC entry 210 (class 1259 OID 33093)
-- Name: sancion_aplicada_id_sancion_usuario_apli_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.sancion_aplicada ALTER COLUMN id_sancion_usuario_apli ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.sancion_aplicada_id_sancion_usuario_apli_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 205 (class 1259 OID 33049)
-- Name: sanciones_usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.sanciones_usuario (
    id_sancion_usuario bigint NOT NULL,
    id_usuario bigint,
    id_item bigint,
    motivo_sistema text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now(),
    fecha_ingresada date,
    fecha_registro date,
    fecha_limite date
);


ALTER TABLE public.sanciones_usuario OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 33047)
-- Name: sanciones_usuario_id_sancion_usuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.sanciones_usuario ALTER COLUMN id_sancion_usuario ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.sanciones_usuario_id_sancion_usuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 203 (class 1259 OID 33037)
-- Name: solicitud_aceptada; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.solicitud_aceptada (
    id_solicitud_aceptada bigint NOT NULL,
    id_solicitud bigint,
    id_item bigint,
    id_usuario bigint,
    descripcion text,
    fecha_ingresada time with time zone,
    fecha_retiro time with time zone,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.solicitud_aceptada OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 33035)
-- Name: solicitud_aceptada_id_solicitud_aceptada_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.solicitud_aceptada ALTER COLUMN id_solicitud_aceptada ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.solicitud_aceptada_id_solicitud_aceptada_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 219 (class 1259 OID 33143)
-- Name: solicitud_usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.solicitud_usuario (
    id_solicitud bigint NOT NULL,
    id_estatus bigint,
    folio_solicitud text,
    id_usuario bigint,
    id_item bigint,
    fecha_inicio date,
    fecha_final date,
    motivo text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.solicitud_usuario OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 33141)
-- Name: solicitud_usuario_id_solicitud_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.solicitud_usuario ALTER COLUMN id_solicitud ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.solicitud_usuario_id_solicitud_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 215 (class 1259 OID 33119)
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usuario (
    id_usuario bigint NOT NULL,
    id_area bigint,
    id_rol bigint,
    primer_nombre text,
    segundo_nombre text,
    apellido_p text,
    apellido_m text,
    matricula text,
    num_telefono text,
    correo text,
    contrasenia text,
    created_at time with time zone DEFAULT now(),
    updated_at time with time zone DEFAULT now()
);


ALTER TABLE public.usuario OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 33117)
-- Name: usuario_id_usuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.usuario ALTER COLUMN id_usuario ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.usuario_id_usuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 3113 (class 0 OID 33025)
-- Dependencies: 201
-- Data for Name: area; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3121 (class 0 OID 33083)
-- Dependencies: 209
-- Data for Name: categoria_item; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3133 (class 0 OID 33156)
-- Dependencies: 221
-- Data for Name: estatus_item; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3119 (class 0 OID 33071)
-- Dependencies: 207
-- Data for Name: item; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3129 (class 0 OID 33131)
-- Dependencies: 217
-- Data for Name: reporte_usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3125 (class 0 OID 33107)
-- Dependencies: 213
-- Data for Name: rol; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3123 (class 0 OID 33095)
-- Dependencies: 211
-- Data for Name: sancion_aplicada; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3117 (class 0 OID 33049)
-- Dependencies: 205
-- Data for Name: sanciones_usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3115 (class 0 OID 33037)
-- Dependencies: 203
-- Data for Name: solicitud_aceptada; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3131 (class 0 OID 33143)
-- Dependencies: 219
-- Data for Name: solicitud_usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3127 (class 0 OID 33119)
-- Dependencies: 215
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 3139 (class 0 OID 0)
-- Dependencies: 200
-- Name: area_id_area_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.area_id_area_seq', 1, false);


--
-- TOC entry 3140 (class 0 OID 0)
-- Dependencies: 208
-- Name: categoria_item_id_categoria_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.categoria_item_id_categoria_seq', 1, false);


--
-- TOC entry 3141 (class 0 OID 0)
-- Dependencies: 220
-- Name: estatus_item_id_estatus_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.estatus_item_id_estatus_seq', 1, false);


--
-- TOC entry 3142 (class 0 OID 0)
-- Dependencies: 206
-- Name: item_id_item_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.item_id_item_seq', 1, false);


--
-- TOC entry 3143 (class 0 OID 0)
-- Dependencies: 216
-- Name: reporte_usuario_id_reporte_usuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.reporte_usuario_id_reporte_usuario_seq', 1, false);


--
-- TOC entry 3144 (class 0 OID 0)
-- Dependencies: 212
-- Name: rol_id_rol_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.rol_id_rol_seq', 1, false);


--
-- TOC entry 3145 (class 0 OID 0)
-- Dependencies: 210
-- Name: sancion_aplicada_id_sancion_usuario_apli_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sancion_aplicada_id_sancion_usuario_apli_seq', 1, false);


--
-- TOC entry 3146 (class 0 OID 0)
-- Dependencies: 204
-- Name: sanciones_usuario_id_sancion_usuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sanciones_usuario_id_sancion_usuario_seq', 1, false);


--
-- TOC entry 3147 (class 0 OID 0)
-- Dependencies: 202
-- Name: solicitud_aceptada_id_solicitud_aceptada_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.solicitud_aceptada_id_solicitud_aceptada_seq', 1, false);


--
-- TOC entry 3148 (class 0 OID 0)
-- Dependencies: 218
-- Name: solicitud_usuario_id_solicitud_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.solicitud_usuario_id_solicitud_seq', 1, false);


--
-- TOC entry 3149 (class 0 OID 0)
-- Dependencies: 214
-- Name: usuario_id_usuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.usuario_id_usuario_seq', 1, false);


--
-- TOC entry 2944 (class 2606 OID 33034)
-- Name: area area_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.area
    ADD CONSTRAINT area_pkey PRIMARY KEY (id_area);


--
-- TOC entry 2952 (class 2606 OID 33092)
-- Name: categoria_item categoria_item_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.categoria_item
    ADD CONSTRAINT categoria_item_pkey PRIMARY KEY (id_categoria);


--
-- TOC entry 2964 (class 2606 OID 33165)
-- Name: estatus_item estatus_item_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.estatus_item
    ADD CONSTRAINT estatus_item_pkey PRIMARY KEY (id_estatus);


--
-- TOC entry 2950 (class 2606 OID 33080)
-- Name: item item_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.item
    ADD CONSTRAINT item_pkey PRIMARY KEY (id_item);


--
-- TOC entry 2960 (class 2606 OID 33140)
-- Name: reporte_usuario reporte_usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reporte_usuario
    ADD CONSTRAINT reporte_usuario_pkey PRIMARY KEY (id_reporte_usuario);


--
-- TOC entry 2956 (class 2606 OID 33116)
-- Name: rol rol_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.rol
    ADD CONSTRAINT rol_pkey PRIMARY KEY (id_rol);


--
-- TOC entry 2954 (class 2606 OID 33104)
-- Name: sancion_aplicada sancion_aplicada_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sancion_aplicada
    ADD CONSTRAINT sancion_aplicada_pkey PRIMARY KEY (id_sancion_usuario_apli);


--
-- TOC entry 2948 (class 2606 OID 33058)
-- Name: sanciones_usuario sanciones_usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sanciones_usuario
    ADD CONSTRAINT sanciones_usuario_pkey PRIMARY KEY (id_sancion_usuario);


--
-- TOC entry 2946 (class 2606 OID 33046)
-- Name: solicitud_aceptada solicitud_aceptada_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_aceptada
    ADD CONSTRAINT solicitud_aceptada_pkey PRIMARY KEY (id_solicitud_aceptada);


--
-- TOC entry 2962 (class 2606 OID 33152)
-- Name: solicitud_usuario solicitud_usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_usuario
    ADD CONSTRAINT solicitud_usuario_pkey PRIMARY KEY (id_solicitud);


--
-- TOC entry 2958 (class 2606 OID 33128)
-- Name: usuario usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario);


--
-- TOC entry 2974 (class 2606 OID 33211)
-- Name: usuario id_area; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT id_area FOREIGN KEY (id_area) REFERENCES public.area(id_area) NOT VALID;


--
-- TOC entry 2970 (class 2606 OID 33191)
-- Name: item id_cate; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.item
    ADD CONSTRAINT id_cate FOREIGN KEY (id_categoria) REFERENCES public.categoria_item(id_categoria) NOT VALID;


--
-- TOC entry 2979 (class 2606 OID 33236)
-- Name: solicitud_usuario id_estat; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_usuario
    ADD CONSTRAINT id_estat FOREIGN KEY (id_estatus) REFERENCES public.estatus_item(id_estatus) NOT VALID;


--
-- TOC entry 2966 (class 2606 OID 33171)
-- Name: solicitud_aceptada id_item; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_aceptada
    ADD CONSTRAINT id_item FOREIGN KEY (id_item) REFERENCES public.item(id_item) NOT VALID;


--
-- TOC entry 2969 (class 2606 OID 33186)
-- Name: sanciones_usuario id_item; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sanciones_usuario
    ADD CONSTRAINT id_item FOREIGN KEY (id_item) REFERENCES public.item(id_item) NOT VALID;


--
-- TOC entry 2973 (class 2606 OID 33206)
-- Name: sancion_aplicada id_item; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sancion_aplicada
    ADD CONSTRAINT id_item FOREIGN KEY (id_item) REFERENCES public.item(id_item) NOT VALID;


--
-- TOC entry 2977 (class 2606 OID 33226)
-- Name: reporte_usuario id_item; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reporte_usuario
    ADD CONSTRAINT id_item FOREIGN KEY (id_item) REFERENCES public.item(id_item) NOT VALID;


--
-- TOC entry 2981 (class 2606 OID 33246)
-- Name: solicitud_usuario id_item; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_usuario
    ADD CONSTRAINT id_item FOREIGN KEY (id_item) REFERENCES public.item(id_item) NOT VALID;


--
-- TOC entry 2975 (class 2606 OID 33216)
-- Name: usuario id_rol; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT id_rol FOREIGN KEY (id_rol) REFERENCES public.rol(id_rol) NOT VALID;


--
-- TOC entry 2971 (class 2606 OID 33196)
-- Name: sancion_aplicada id_sancion_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sancion_aplicada
    ADD CONSTRAINT id_sancion_usuario FOREIGN KEY (id_sancion_usuario) REFERENCES public.sanciones_usuario(id_sancion_usuario) NOT VALID;


--
-- TOC entry 2978 (class 2606 OID 33231)
-- Name: reporte_usuario id_soli; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reporte_usuario
    ADD CONSTRAINT id_soli FOREIGN KEY (id_solicitud) REFERENCES public.solicitud_usuario(id_solicitud) NOT VALID;


--
-- TOC entry 2965 (class 2606 OID 33166)
-- Name: solicitud_aceptada id_solic; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_aceptada
    ADD CONSTRAINT id_solic FOREIGN KEY (id_solicitud) REFERENCES public.solicitud_usuario(id_solicitud) NOT VALID;


--
-- TOC entry 2967 (class 2606 OID 33176)
-- Name: solicitud_aceptada id_usu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_aceptada
    ADD CONSTRAINT id_usu FOREIGN KEY (id_usuario) REFERENCES public.usuario(id_usuario) NOT VALID;


--
-- TOC entry 2968 (class 2606 OID 33181)
-- Name: sanciones_usuario id_usu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sanciones_usuario
    ADD CONSTRAINT id_usu FOREIGN KEY (id_usuario) REFERENCES public.usuario(id_usuario) NOT VALID;


--
-- TOC entry 2972 (class 2606 OID 33201)
-- Name: sancion_aplicada id_usu; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.sancion_aplicada
    ADD CONSTRAINT id_usu FOREIGN KEY (id_usuario) REFERENCES public.usuario(id_usuario) NOT VALID;


--
-- TOC entry 2976 (class 2606 OID 33221)
-- Name: reporte_usuario id_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reporte_usuario
    ADD CONSTRAINT id_usuario FOREIGN KEY (id_usuario) REFERENCES public.usuario(id_usuario) NOT VALID;


--
-- TOC entry 2980 (class 2606 OID 33241)
-- Name: solicitud_usuario id_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.solicitud_usuario
    ADD CONSTRAINT id_usuario FOREIGN KEY (id_usuario) REFERENCES public.usuario(id_usuario) NOT VALID;


-- Completed on 2021-09-13 18:31:14

--
-- PostgreSQL database dump complete
--

