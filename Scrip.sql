USE [heladeria]
GO
/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[categoria](
	[cod_cat] [int] NOT NULL,
	[descripcion] [varchar](40) NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_cat] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ciudad]    Script Date: 22/7/2020 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ciudad](
	[cod_ciu] [int] NOT NULL,
	[nom_ciu] [varchar](40) NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_ciu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cliente](
	[cod_client] [int] NOT NULL,
	[ced_client] [varchar](40) NULL,
	[nom_client] [varchar](40) NULL,
	[ape_client] [varchar](40) NULL,
	[email_client] [varchar](40) NULL,
	[telf_client] [varchar](40) NULL,
	[dir_client] [varchar](40) NULL,
	[cod_ciu] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_client] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[compras](
	[cod_cmpra] [int] NOT NULL,
	[ced_ruc_prov] [varchar](60) NULL,
	[ced_empl] [varchar](60) NULL,
	[fecha_pedido] [varchar](60) NULL,
	[fecha_entrega] [varchar](60) NULL,
	[estado_cmpra] [int] NULL,
	[subtotal] [float] NULL,
	[iva_cmpra] [float] NULL,
	[desc_cmpra] [float] NULL,
	[total_cmpra] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_cmpra] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[detalle_vnta](
	[cod_vnta] [int] NOT NULL,
	[cant] [int] NULL,
	[cod_prod] [int] NULL,
	[prec_unit] [float] NULL,
	[det_iva] [float] NULL,
	[descuento] [float] NULL,
	[total] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_vnta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

GO/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[empleado](
	[id_empleado] [int] NOT NULL,
	[ced_usu] [varchar](40) NULL,
	[registrar] [int] NULL,
	[upadate] [int] NULL,
	[delet] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_permiso] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[producto](
	[cod_prod] [int] NOT NULL,
	[nom_prod] [varchar](60) NULL,
	[cod_marca] [int] NULL,
	[prec_compra] [float] NULL,
	[prec_vnta] [float] NULL,
	[iva_prod] [float] NULL,
	[cant_prod] [int] NULL,
	[cod_cat] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_prod] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[proveedor](
	[cod_prov] [int] NOT NULL,
	[ruc_ced] [varchar](40) NULL,
	[nom_prov] [varchar](40) NULL,
	[direccion] [varchar](40) NULL,
	[id_ciudad] [int] NULL,
	[telf] [varchar](40) NULL,
	[email] [varchar](40) NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_prov] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[rol](
	[cod_rol] [int] NOT NULL,
	[nom_rol] [varchar](40) NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_rol] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[usuario]    Script Date: 22/7/2020 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[usuario](
	[cod_usuario] [int] NOT NULL,
	[cod_rol] [int] NULL,
	[ced_usua] [varchar](40) NULL,
	[nom_usua] [varchar](40) NULL,
	[ape_usua] [varchar](40) NULL,
	[email_usua] [varchar](40) NULL,
	[telf_usua] [varchar](40) NULL,
	[dir_usua] [varchar](40) NULL,
	[cod_ciu] [int] NULL,
	[passward] [varchar](40) NULL,
	[aux] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_usuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO/****** Object:  Table [dbo].[categoria]    Script Date: 14/3/2021 2:51:11 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ventas](
	[cod_vnta] [int] NOT NULL,
	[ced_client] [varchar](60) NULL,
	[ced_empl] [varchar](60) NULL,
	[fecha] [varchar](60) NULL,
	[form_pago] [varchar](60) NULL,
	[estado_vnta] [int] NULL,
	[subtotal] [float] NULL,
	[iva] [float] NULL,
	[descuento] [float] NULL,
	[total] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[cod_vnta] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
